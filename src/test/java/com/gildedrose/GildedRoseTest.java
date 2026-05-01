package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void givenAgedBrieItem_when50DaysPassed_shouldCalculateCorrectQuality() {
        Item[] items = new Item[] {new Item("Aged Brie", 15, 15)};

        GildedRose app = new GildedRose(items);
        assertEquals("Aged Brie", app.items[0].name);
        Item item = app.items[0];

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(5, item.sellIn);
        assertEquals(25, item.quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(0, item.sellIn);
        assertEquals(30, item.quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(-5, item.sellIn);
        assertEquals(40, item.quality);

        for (int i = 0; i < 30; i++) {
            app.updateQuality();
        }
        assertEquals(-35, item.sellIn);
        assertEquals(50, item.quality);
    }

    @Test
    void givenBackstagePassesItem_when50DaysPassed_shouldCalculateCorrectQuality() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 15, 15)};

        GildedRose app = new GildedRose(items);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        Item item = app.items[0];

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(10, item.sellIn);
        assertEquals(20, item.quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(5, item.sellIn);
        assertEquals(30, item.quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(0, item.sellIn);
        assertEquals(45, item.quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(-5, item.sellIn);
        assertEquals(0, item.quality);

        for (int i = 0; i < 30; i++) {
            app.updateQuality();
        }
        assertEquals(-35, item.sellIn);
        assertEquals(0, item.quality);
    }

    @Test
    void givenSulfurasItem_when50DaysPassed_shouldCalculateCorrectQuality() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 15, 80)};

        GildedRose app = new GildedRose(items);
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        Item item = app.items[0];

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(15, item.sellIn);
        assertEquals(80, item.quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(15, item.sellIn);
        assertEquals(80, item.quality);

        for (int i = 0; i < 40; i++) {
            app.updateQuality();
        }
        assertEquals(15, item.sellIn);
        assertEquals(80, item.quality);
    }

    @Test
    void givenCommonItem_when50DaysPassed_shouldCalculateCorrectQuality() {
        Item[] items = new Item[] {new Item("Any Other Item", 15, 26)};

        GildedRose app = new GildedRose(items);
        assertEquals("Any Other Item", app.items[0].name);
        Item item = app.items[0];

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(10, item.sellIn);
        assertEquals(21, item.quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(5, item.sellIn);
        assertEquals(16, item.quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(0, item.sellIn);
        assertEquals(11, item.quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(-5, item.sellIn);
        assertEquals(1, item.quality);

        app.updateQuality();
        assertEquals(-6, item.sellIn);
        assertEquals(0, item.quality);

        for (int i = 0; i < 29; i++) {
            app.updateQuality();
        }
        assertEquals(-35, item.sellIn);
        assertEquals(0, item.quality);
    }
}
