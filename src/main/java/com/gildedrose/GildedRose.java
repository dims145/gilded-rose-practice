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
            if (!item.name.equals("Aged Brie")
                    && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality > 0) {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.quality = item.quality - 1;
                    }
                }
            }

            strategy.updateEndDay(item);
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")
                    && !item.name.equals("Aged Brie") // temp
                    && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.quality > 0) {
                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                item.quality = item.quality - 1;
                            }
                        }
                    } else {
                        item.quality = 0;
                    }
                }
            }
        }
    }
}
