package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.contract.UpdateQualityStrategy;

public class SulfurasUpdateQualityStrategy implements UpdateQualityStrategy {
    @Override
    public void calculateStrategy(Item item) {
        // no changes
    }
}
