package com.gildedrose.item;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LegendaryItemTest {

    private static final String LEGENDARY_ITEM = "Sulfuras, Hand of Ragnaros";

    @Test
    void test_legendary_item_quality_fixed() {
        Item[] items = new Item[]{new Item(LEGENDARY_ITEM, 0, 80)};
        GildedRose app = new GildedRose(items);
        app.endOfDayUpdate();
        assertEquals(80, app.items[0].quality);
    }
}