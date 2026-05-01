package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.contract.UpdateItemStrategy;
import com.gildedrose.strategy.AgedBrieUpdateItemStrategy;
import com.gildedrose.strategy.BackstagePassesUpdateItemStrategy;
import com.gildedrose.strategy.CommonUpdateItemStrategy;
import com.gildedrose.strategy.SulfurasUpdateItemStrategy;

public class UpdateItemFactory {
    public static UpdateItemStrategy createUpdateItemStrategy(Item item) {
        if (item.name.startsWith("Aged Brie")) {
            return new AgedBrieUpdateItemStrategy();
        } else if (item.name.startsWith("Backstage passes")) {
            return new BackstagePassesUpdateItemStrategy();
        } else if (item.name.startsWith("Sulfuras")) {
            return new SulfurasUpdateItemStrategy();
        } else {
            return new CommonUpdateItemStrategy();
        }
    }
}
