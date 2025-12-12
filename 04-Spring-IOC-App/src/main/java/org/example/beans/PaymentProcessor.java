package org.example.beans;


public class PaymentProcessor {

    public IPayment payment;

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }


    public void processPayment( double amount){
        boolean status = payment.pay(amount);
        if (status) {
            System.out.println("Payment successful");
        }else {
            System.out.println("Payment failed");
        }
    }
}


