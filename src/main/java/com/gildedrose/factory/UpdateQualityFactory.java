package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.contract.UpdateQualityStrategy;
import com.gildedrose.strategy.AgedBrieUpdateQualityStrategy;
import com.gildedrose.strategy.BackstagePassesUpdateQualityStrategy;
import com.gildedrose.strategy.CommonUpdateQualityStrategy;
import com.gildedrose.strategy.SulfurasUpdateQualityStrategy;

public class UpdateQualityFactory {
    public static UpdateQualityStrategy createStrategy(Item item) {
        if (item.name.equals("Aged Brie")) {
            return new AgedBrieUpdateQualityStrategy();
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePassesUpdateQualityStrategy();
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new SulfurasUpdateQualityStrategy();
        } else {
            return new CommonUpdateQualityStrategy();
        }
    }
}
