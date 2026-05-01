package com.gildedrose;

import com.gildedrose.contract.UpdateQualityStrategy;
import com.gildedrose.factory.UpdateQualityFactory;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdateQualityStrategy strategy = UpdateQualityFactory.createStrategy(item);
            strategy.calculateStrategy(item);
        }
    }
}
