package com.gildedrose.item.category;

import com.gildedrose.Item;
import com.gildedrose.GildedRoseItem;

public class ConjuredItem extends GildedRoseItem {
    public ConjuredItem(Item item) {
        super(item);
    }

    @Override
    public void endOfDayUpdate() {
        sellInDown();
        qualityDown();
        qualityDown();
    }
}
