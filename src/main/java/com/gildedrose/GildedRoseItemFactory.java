package com.gildedrose;

import com.gildedrose.item.AgedBrie;
import com.gildedrose.item.BackstagePass;
import com.gildedrose.item.category.ConjuredItem;
import com.gildedrose.item.category.LegendaryItem;
import com.gildedrose.item.category.RegularItem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GildedRoseItemFactory {
    public List<GildedRoseItem> buildStock(Item[] items) {
        return Arrays.stream(items)
                .map(this::build)
                .collect(Collectors.toList());
    }

    private GildedRoseItem build(Item item) {
        if (item.name.equals("Aged Brie")) return new AgedBrie(item);
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) return new BackstagePass(item);
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) return new LegendaryItem(item);
        if (item.name.startsWith("Conjured")) return new ConjuredItem(item);
        return new RegularItem(item);
    }
}
