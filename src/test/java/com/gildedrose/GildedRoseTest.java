package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void givenAgedBrieItem_when50DaysPassed_shouldCalculateQualityCorrectly() {
        Item[] items = new Item[] {new Item("Aged Brie", 15, 15)};

        GildedRose app = new GildedRose(items);
        Item item = app.items[0];
        assertEquals("Aged Brie, 15, 15", item.toString());

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(10, item.sellIn);
        assertEquals(20, item.quality);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(0, item.sellIn);
        assertEquals(30, item.quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(-5, item.sellIn);
        assertEquals(40, item.quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(-10, item.sellIn);
        assertEquals(50, item.quality);

        for (int i = 0; i < 25; i++) {
            app.updateQuality();
        }
        assertEquals(-35, item.sellIn);
        assertEquals(50, item.quality);
    }

    @Test
    void givenBackstagePassesItem_when50DaysPassed_shouldCalculateQualityCorrectly() {
        Item[] items =
                new Item[] {
                    new Item("Backstage passes to a TAFKAL80ETC concert", 15, 15),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 15, 33),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 15, 44)
                };

        GildedRose app = new GildedRose(items);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(10, app.items[0].sellIn);
        assertEquals(10, app.items[1].sellIn);
        assertEquals(10, app.items[2].sellIn);
        assertEquals(20, app.items[0].quality);
        assertEquals(38, app.items[1].quality);
        assertEquals(49, app.items[2].quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(5, app.items[0].sellIn);
        assertEquals(5, app.items[1].sellIn);
        assertEquals(5, app.items[2].sellIn);
        assertEquals(30, app.items[0].quality);
        assertEquals(48, app.items[1].quality);
        assertEquals(50, app.items[2].quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(0, app.items[0].sellIn);
        assertEquals(0, app.items[1].sellIn);
        assertEquals(0, app.items[2].sellIn);
        assertEquals(45, app.items[0].quality);
        assertEquals(50, app.items[1].quality);
        assertEquals(50, app.items[2].quality);

        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(-1, app.items[1].sellIn);
        assertEquals(-1, app.items[2].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals(0, app.items[1].quality);
        assertEquals(0, app.items[2].quality);

        for (int i = 0; i < 34; i++) {
            app.updateQuality();
        }
        assertEquals(-35, app.items[0].sellIn);
        assertEquals(-35, app.items[1].sellIn);
        assertEquals(-35, app.items[2].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals(0, app.items[1].quality);
        assertEquals(0, app.items[2].quality);
    }

    @Test
    void givenSulfurasItem_when50DaysPassed_shouldCalculateQualityCorrectly() {
        Item[] items =
                new Item[] {
                    new Item("Sulfuras, Hand of Ragnaros", 15, 80),
                    new Item("Sulfuras, Hand of Ragnaros", -5, 80)
                };

        GildedRose app = new GildedRose(items);
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(15, app.items[0].sellIn);
        assertEquals(-5, app.items[1].sellIn);
        assertEquals(80, app.items[0].quality);
        assertEquals(80, app.items[1].quality);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(15, app.items[0].sellIn);
        assertEquals(-5, app.items[1].sellIn);
        assertEquals(80, app.items[0].quality);
        assertEquals(80, app.items[1].quality);

        for (int i = 0; i < 35; i++) {
            app.updateQuality();
        }
        assertEquals(15, app.items[0].sellIn);
        assertEquals(-5, app.items[1].sellIn);
        assertEquals(80, app.items[0].quality);
        assertEquals(80, app.items[1].quality);
    }

    @Test
    void givenCommonItem_when50DaysPassed_shouldCalculateQualityCorrectly() {
        Item[] items =
                new Item[] {new Item("Any Other Item", 15, 35), new Item("Any Other Item", 15, 10)};

        GildedRose app = new GildedRose(items);
        assertEquals("Any Other Item", app.items[0].name);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(10, app.items[0].sellIn);
        assertEquals(10, app.items[1].sellIn);
        assertEquals(30, app.items[0].quality);
        assertEquals(5, app.items[1].quality);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(0, app.items[0].sellIn);
        assertEquals(0, app.items[1].sellIn);
        assertEquals(20, app.items[0].quality);
        assertEquals(0, app.items[1].quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(-5, app.items[0].sellIn);
        assertEquals(-5, app.items[1].sellIn);
        assertEquals(10, app.items[0].quality);
        assertEquals(0, app.items[1].quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(-10, app.items[1].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals(0, app.items[1].quality);

        for (int i = 0; i < 25; i++) {
            app.updateQuality();
        }
        assertEquals(-35, app.items[0].sellIn);
        assertEquals(-35, app.items[1].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals(0, app.items[1].quality);
    }
}
