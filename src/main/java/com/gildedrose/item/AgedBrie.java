package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.GildedRoseItem;

public class AgedBrie extends GildedRoseItem {

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void endOfDayUpdate() {
        sellInDown();
        qualityUp();
    }
}
