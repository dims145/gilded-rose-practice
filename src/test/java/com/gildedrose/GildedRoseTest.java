package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void givenItemAgedBrie_when50DaysPassed_shouldHaveCorrectQuality() {
        Item[] items = new Item[] {new Item("Aged Brie", 10, 10)};

        GildedRose app = new GildedRose(items);
        assertEquals("Aged Brie", app.items[0].name);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(0, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);

        for (int i = 0; i < 20; i++) {
            app.updateQuality();
        }
        assertEquals(-40, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void givenItemBackstagePasses_when50DaysPassed_shouldHaveCorrectQuality() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)};

        GildedRose app = new GildedRose(items);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);

        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertEquals(5, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);

        for (int i = 0; i < 4; i++) {
            app.updateQuality();
        }
        assertEquals(1, app.items[0].sellIn);
        assertEquals(32, app.items[0].quality);

        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(35, app.items[0].quality);

        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

        for (int i = 0; i < 39; i++) {
            app.updateQuality();
        }
        assertEquals(-40, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void givenItemSulfuras_when50DaysPassed_shouldHaveCorrectQuality() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 10, 80)};

        GildedRose app = new GildedRose(items);
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);

        for (int i = 0; i < 10; i++) {
            app.updateQuality();
        }
        assertEquals(10, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);

        for (int i = 0; i < 40; i++) {
            app.updateQuality();
        }
        assertEquals(10, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }
}
