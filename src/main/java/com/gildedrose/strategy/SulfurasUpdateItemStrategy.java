package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.contract.UpdateItemStrategy;

public class SulfurasUpdateItemStrategy implements UpdateItemStrategy {
    @Override
    public void updateStartDay(Item item) {
        // no changes in item
    }

    @Override
    public void updateEndDay(Item item) {
        // no changes in item
    }
}
