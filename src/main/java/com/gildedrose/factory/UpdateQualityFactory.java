package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.contract.UpdateQualityStrategy;
import com.gildedrose.strategy.AgedBrieUpdateQualityStrategy;

public class UpdateQualityFactory {
    public static UpdateQualityStrategy createStrategy(Item item) {
        if (item.name.startsWith("Aged Brie")) {
            return new AgedBrieUpdateQualityStrategy();
        } else {
            return null;
        }
    }
}
