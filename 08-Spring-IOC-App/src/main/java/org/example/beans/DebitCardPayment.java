package org.example.beans;

public class DebitCardPayment implements IPayment{

    public void CreditCardPayment(){
        System.out.println("Credit card constructor called ");
    }

    @Override
    public boolean pay(double amount) {

        System.out.println("Payment with debit card");
        return true;
    }
}
