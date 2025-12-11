public class PaymentProcessor {


//    // constructor injection
//    public PaymentProcessor(IPayment payment  ) {
//        this.payment=payment;
//    }

    // setter injection
    public void setPayment(IPayment payment){
        this.payment=payment;
    }

    private IPayment payment;
    public void processPayment( double amount) {
        boolean status = payment.pay(amount);
        if (status){
            System.out.println("Payment successful .. ThankYou ..visit again");
        }else {
            System.out.println("Payment failed .. Please try again");
        }

    }
}
