package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void givenAgedBrieItem_when30DaysPassed_shouldCalculateCorrectQuality() {
        Item[] items = new Item[] {new Item("Aged Brie", 15, 15)};

        GildedRose app = new GildedRose(items);
        assertEquals("Aged Brie", app.items[0].name);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(5, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(0, app.items[0].sellIn);
        assertEquals(30, app.items[0].quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(-5, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(-15, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void givenBackstagePassesItem_when30DaysPassed_shouldCalculateCorrectQuality() {
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

        for (int i = 0; i < 15; i++) {
            app.updateQuality();
        }
        assertEquals(-15, app.items[0].sellIn);
        assertEquals(-15, app.items[1].sellIn);
        assertEquals(-15, app.items[2].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals(0, app.items[1].quality);
        assertEquals(0, app.items[2].quality);
    }

    @Test
    void givenSulfurasItem_when30DaysPassed_shouldCalculateCorrectQuality() {
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

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(15, app.items[0].sellIn);
        assertEquals(-5, app.items[1].sellIn);
        assertEquals(80, app.items[0].quality);
        assertEquals(80, app.items[1].quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(15, app.items[0].sellIn);
        assertEquals(-5, app.items[1].sellIn);
        assertEquals(80, app.items[0].quality);
        assertEquals(80, app.items[1].quality);

        for (int i = 0; i < 15; i++) {
            app.updateQuality();
        }
        assertEquals(15, app.items[0].sellIn);
        assertEquals(-5, app.items[1].sellIn);
        assertEquals(80, app.items[0].quality);
        assertEquals(80, app.items[1].quality);
    }

    @Test
    void givenCommonItem_when30DaysPassed_shouldCalculateCorrectQuality() {
        Item[] items =
                new Item[] {new Item("Any Other Item", 15, 15), new Item("Any Other Item", 15, 35)};

        GildedRose app = new GildedRose(items);
        assertEquals("Any Other Item", app.items[0].name);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(5, app.items[0].sellIn);
        assertEquals(5, app.items[1].sellIn);
        assertEquals(5, app.items[0].quality);
        assertEquals(25, app.items[1].quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(0, app.items[0].sellIn);
        assertEquals(0, app.items[1].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals(20, app.items[1].quality);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(-5, app.items[0].sellIn);
        assertEquals(-5, app.items[1].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals(10, app.items[1].quality);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(-15, app.items[0].sellIn);
        assertEquals(-15, app.items[1].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals(0, app.items[1].quality);
    }
}
