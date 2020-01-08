package com.gildedrose.item;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackstagePassTest {

    private static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";

    @Test
    void test_backstage_pass_quality_up_one() {
        Item[] items = new Item[] { new Item(BACKSTAGE_PASS, 15, 10) };
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(11, app.items[0].quality);
    }

    @Test
    void test_backstage_pass_quality_up_two() {
        Item[] items = new Item[] { new Item(BACKSTAGE_PASS, 10, 10) };
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(12, app.items[0].quality);
    }

    @Test
    void test_backstage_pass_quality_up_three() {
        Item[] items = new Item[] { new Item(BACKSTAGE_PASS, 3, 10) };
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(13, app.items[0].quality);
    }

    @Test
    void test_aged_backstage_pass_sell_in_down() {
        Item[] items = new Item[] { new Item(BACKSTAGE_PASS, 10, 10) };
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void test_aged_backstage_pass_quality_drops_to_zero_after_concert() {
        Item[] items = new Item[] { new Item(BACKSTAGE_PASS, 1, 10) };
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(0, app.items[0].quality);
    }
}
