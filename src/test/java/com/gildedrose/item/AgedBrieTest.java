package com.gildedrose.item;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieTest {

    private static final String AGED_BRIE = "Aged Brie";

    @Test
    void test_aged_brie_name() {
        Item[] items = new Item[] { new Item(AGED_BRIE, 0, 0) };
        GildedRose app = new GildedRose(items);
        assertEquals(AGED_BRIE, app.items[0].name);
    }

    @Test
    void test_aged_brie_quality_up() {
        Item[] items = new Item[] { new Item(AGED_BRIE, 10, 10) };
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(11, app.items[0].quality);
    }

    @Test
    void test_aged_brie_sell_in_down() {
        Item[] items = new Item[] { new Item(AGED_BRIE, 10, 10) };
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void test_regular_item_quality_max_50() {
        Item[] items = new Item[]{new Item(AGED_BRIE, 10, 50)};
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        app.endOfDayUpdate();
        app.endOfDayUpdate();
        assertEquals(50, app.items[0].quality);
    }
}
