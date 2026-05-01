package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.contract.UpdateItemStrategy;
import com.gildedrose.strategy.*;

public class UpdateItemFactory {
    public static UpdateItemStrategy createUpdateItemStrategy(Item item) {
        if (item.name.startsWith("Aged Brie")) {
            return new AgedBrieUpdateItemStrategy();
        } else if (item.name.startsWith("Backstage passes")) {
            return new BackstagePassesUpdateItemStrategy();
        } else if (item.name.startsWith("Sulfuras")) {
            return new SulfurasUpdateItemStrategy();
        } else if (item.name.startsWith("Conjured")) {
            return new ConjuredUpdateItemStrategy();
        } else {
            return new CommonUpdateItemStrategy();
        }
    }
}
