package com.gildedrose;

import com.gildedrose.contract.ItemUpdateStrategy;
import com.gildedrose.factory.ItemUpdateFactory;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdateStrategy strategy = ItemUpdateFactory.createItemUpdateStrategy(item);
            strategy.update(item);
        }
    }
}
