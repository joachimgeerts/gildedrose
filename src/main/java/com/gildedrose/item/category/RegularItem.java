package com.gildedrose.item.category;

import com.gildedrose.Item;
import com.gildedrose.GildedRoseItem;

public class RegularItem extends GildedRoseItem {
    public RegularItem(Item item) {
        super(item);
    }

    @Override
    public void endOfDayUpdate() {
        sellInDown();
        qualityDown();
    }
}
