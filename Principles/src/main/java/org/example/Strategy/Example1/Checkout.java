package org.example.Strategy.Example1;

// Checkout class doesn’t care about how to process payment and what type of payment it is.

public class Checkout {
    void processCheckout(PaymentStrategy paymentStrategy) {

        paymentStrategy.processPayment();

        System.out.println("Checkout Process Completed");
    }
}
