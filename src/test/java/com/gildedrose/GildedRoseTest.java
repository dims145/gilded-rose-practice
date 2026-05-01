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
}
