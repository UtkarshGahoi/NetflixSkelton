package org.example;

public class DebitCardPayment implements Payment{

    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public DebitCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
    @Override
    public void pay(double amount) {

    }
}
