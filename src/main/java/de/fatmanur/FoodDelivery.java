package de.fatmanur;

public class FoodDelivery {

    public static void main(String[] args) {

        double foodPrice = 12.50;
        double deliveryFee = 2.99;
        double totalPrice = calculateTotalPrice(foodPrice, deliveryFee);

        System.out.println("Food Delivery Bestellung");
        System.out.println("Gesamtpreis: " + totalPrice);
    }

    public static double calculateTotalPrice(double foodPrice, double deliveryFee) {
        if (deliveryFee < 0) {
            throw new IllegalArgumentException("Liefergebühr darf nicht negativ sein");
        }
        return foodPrice + deliveryFee;
    }

    public static String processDelivery(boolean expressDelivery) {
        if (expressDelivery) {
            return "Express";
        }
        return "Standard";
    }
}