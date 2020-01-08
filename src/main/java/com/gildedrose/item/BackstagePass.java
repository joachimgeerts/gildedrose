package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.GildedRoseItem;

public class BackstagePass extends GildedRoseItem {

    public BackstagePass(Item item) {
        super(item);
    }

    @Override
    public void endOfDayUpdate() {
        sellInDown();
        if (!this.isExpired()) {
            qualityUp();
            if (item.sellIn  <= 10) {
                qualityUp();
            }
            if (item.sellIn <= 5) {
                qualityUp();
            }
        } else {
            item.quality = 0;
        }
    }
}
