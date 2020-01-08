package com.gildedrose.item;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConjuredItemTest {

    private static final String CONJURED_ITEM = "Conjured item";

    @Test
    void test_conjured_item_quality_down_two() {
        Item[] items = new Item[]{new Item(CONJURED_ITEM, 10, 10)};
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void test_conjured_item_sell_in_down() {
        Item[] items = new Item[]{new Item(CONJURED_ITEM, 10, 10)};
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(9, app.items[0].sellIn);
    }
}
