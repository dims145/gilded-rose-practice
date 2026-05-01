package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.contract.ItemUpdateStrategy;
import com.gildedrose.strategy.*;

public class ItemUpdateFactory {
    public static ItemUpdateStrategy createItemUpdateStrategy(Item item) {
        if ("Aged Brie".equals(item.name)) {
            return new AgedBrieUpdateStrategy();
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
            return new BackstagePassesUpdateStrategy();
        } else if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {
            return new SulfurasUpdateStrategy();
        } else if ("Conjured Mana Cake".equals(item.name)) {
            return new ConjuredUpdateStrategy();
        } else {
            return new CommonUpdateStrategy();
        }
    }
}
