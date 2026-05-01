package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.contract.UpdateQualityStrategy;

public class AgedBrieUpdateQualityStrategy implements UpdateQualityStrategy {
    @Override
    public void calculateStrategy(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0 && item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
