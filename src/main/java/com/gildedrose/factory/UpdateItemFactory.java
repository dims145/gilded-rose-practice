package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.contract.UpdateItemStrategy;
import com.gildedrose.strategy.AgedBrieUpdateItemStrategy;

public class UpdateItemFactory {
    public static UpdateItemStrategy createUpdateItemStrategy(Item item) {
        if (item.name.startsWith("Aged Brie")) {
            return new AgedBrieUpdateItemStrategy();
        }
        throw new IllegalArgumentException("Strategy not implemented yet");
    }
}
