package org.example;

public class PaymentContext {
    private Payment strategy;

    public void setStrategy(Payment strategy) {
        this.strategy = strategy;
    }

    public void makePayment(double amount) {
        strategy.pay(amount);
    }
}
