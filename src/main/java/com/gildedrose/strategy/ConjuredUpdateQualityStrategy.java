package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.contract.UpdateQualityStrategy;

public class ConjuredUpdateQualityStrategy implements UpdateQualityStrategy {
    @Override
    public void calculateStrategy(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 2;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality = item.quality - 2;
        }

        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
