package com.gildedrose;

import com.gildedrose.contract.UpdateItemStrategy;
import com.gildedrose.factory.UpdateItemFactory;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdateItemStrategy strategy = UpdateItemFactory.createUpdateItemStrategy(item);

            strategy.updateStartDay(item);

            strategy.updateEndDay(item);
        }
    }
}
