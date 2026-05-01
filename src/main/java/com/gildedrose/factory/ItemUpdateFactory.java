package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.contract.ItemUpdateStrategy;
import com.gildedrose.strategy.AgedBrieUpdateStrategy;

public class ItemUpdateFactory {
    public static ItemUpdateStrategy createItemUpdateStrategy(Item item) {
        if ("Aged Brie".equals(item.name)) {
            return new AgedBrieUpdateStrategy();
        } else {
            return null;
        }
    }
}
