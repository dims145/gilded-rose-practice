package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.contract.ItemUpdateStrategy;

public class ConjuredUpdateStrategy implements ItemUpdateStrategy {
    @Override
    public void update(Item item) {
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
