package de.fatmanur;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class CheckoutServiceTest {

    @Test
    void testSuccessfulPayment() {
        PaymentProvider paymentProvider = mock(PaymentProvider.class);
        when(paymentProvider.pay(15.49)).thenReturn(true);

        CheckoutService checkoutService = new CheckoutService(paymentProvider);

        assertTrue(checkoutService.checkout(15.49));
    }

    @Test
    void testFailedPayment() {
        PaymentProvider paymentProvider = mock(PaymentProvider.class);
        when(paymentProvider.pay(15.49)).thenReturn(false);

        CheckoutService checkoutService = new CheckoutService(paymentProvider);

        assertFalse(checkoutService.checkout(15.49));
    }
}