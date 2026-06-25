package de.fatmanur;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FoodDeliveryTest {

    @Test
    void testCalculateTotalPrice() {
        double result = FoodDelivery.calculateTotalPrice(12.50, 2.99);

        assertEquals(15.49, result);
    }

    @Test
    void testExpressDelivery() {
        String result = FoodDelivery.processDelivery(true);

        assertEquals("Express", result);
    }

    @Test
    void testNegativeDeliveryFeeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            FoodDelivery.calculateTotalPrice(12.50, -2.99);
        });
    }
}