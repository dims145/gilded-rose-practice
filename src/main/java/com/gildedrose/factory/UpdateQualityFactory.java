package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.contract.UpdateQualityStrategy;
import com.gildedrose.strategy.*;

public class UpdateQualityFactory {
    public static UpdateQualityStrategy createStrategy(Item item) {
        if (item.name.startsWith("Aged Brie")) {
            return new AgedBrieUpdateQualityStrategy();
        } else if (item.name.startsWith("Backstage passes")) {
            return new BackstagePassesUpdateQualityStrategy();
        } else  if (item.name.startsWith("Sulfuras")) {
            return new SulfurasUpdateQualityStrategy();
        } else  if (item.name.startsWith("Conjured")) {
            return new ConjuredUpdateQualityStrategy();
        } else {
            return new CommonUpdateQualityStrategy();
        }
    }
}
