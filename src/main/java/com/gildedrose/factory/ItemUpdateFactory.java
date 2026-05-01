package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.contract.ItemUpdateStrategy;
import com.gildedrose.strategy.AgedBrieUpdateStrategy;
import com.gildedrose.strategy.BackstagePassesUpdateStrategy;
import com.gildedrose.strategy.CommonUpdateStrategy;
import com.gildedrose.strategy.SulfurasUpdateStrategy;

public class ItemUpdateFactory {
    public static ItemUpdateStrategy createItemUpdateStrategy(Item item) {
        if ("Aged Brie".equals(item.name)) {
            return new AgedBrieUpdateStrategy();
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
            return new BackstagePassesUpdateStrategy();
        } else if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {
            return new SulfurasUpdateStrategy();
        } else {
            return new CommonUpdateStrategy();
        }
    }
}
