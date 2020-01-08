package com.gildedrose.item;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularItemTest {

    private static final String REGULAR_ITEM = "A regular item";

    @Test
    void test_regular_item_quality_down() {
        Item[] items = new Item[]{new Item(REGULAR_ITEM, 10, 10)};
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(9, app.items[0].quality);
    }

    @Test
    void test_regular_item_sell_in_down() {
        Item[] items = new Item[]{new Item(REGULAR_ITEM, 10, 10)};
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void test_regular_item_quality_min_0() {
        Item[] items = new Item[]{new Item(REGULAR_ITEM, 10, 0)};
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        app.endOfDayUpdate();
        app.endOfDayUpdate();
        assertEquals(0, app.items[0].quality);
    }
}