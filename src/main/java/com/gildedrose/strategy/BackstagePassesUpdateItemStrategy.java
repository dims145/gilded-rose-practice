package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.contract.UpdateItemStrategy;

public class BackstagePassesUpdateItemStrategy implements UpdateItemStrategy {
    @Override
    public void updateStartDay(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }

        if (item.sellIn < 11 && item.quality < 50) {
            item.quality = item.quality + 1;
        }

        if (item.sellIn < 6 && item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    @Override
    public void updateEndDay(Item item) {
        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
