package com.gildedrose;

public abstract class GildedRoseItem {

    protected Item item;

    public GildedRoseItem(Item item) {
        this.item = item;
    }

    public abstract void endOfDayUpdate();

    protected void qualityUp() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    protected void qualityDown() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }

        if (item.quality > 0 && isExpired()) {
            item.quality = item.quality - 1;
        }
    }

    protected void sellInDown() {
        item.sellIn = item.sellIn - 1;
    }

    protected boolean isExpired() {
        return item.sellIn <= 0;
    }
}
