package com.gildedrose.contract;

import com.gildedrose.Item;

public interface UpdateItemStrategy {
    void updateStartDay(Item item);

    void updateEndDay(Item item);
}
