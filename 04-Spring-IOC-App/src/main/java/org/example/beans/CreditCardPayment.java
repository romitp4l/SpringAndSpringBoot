package org.example.beans;

public class CreditCardPayment implements IPayment{
    void CreditCardPayment(){
        System.out.println("Credit card constructor called ");
    }
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment with credit card");
        return true;
    }
}
