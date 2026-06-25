package de.fatmanur;

public class CheckoutService {

    private PaymentProvider paymentProvider;

    public CheckoutService(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public boolean checkout(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Betrag muss positiv sein");
        }

        return paymentProvider.pay(amount);
    }
}