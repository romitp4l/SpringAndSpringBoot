public class Main
{
    static void main() {

//        // constructor Injection
        //************************************************
//
//       // PaymentProcessor processor = new PaymentProcessor( new DebitCardPayment());
//
//        // or
//        DebitCardPayment dcp = new DebitCardPayment();
//        PaymentProcessor processor =

        //  Setter Injection
        //************************************************

        PaymentProcessor processor = new PaymentProcessor();
        processor.setPayment( new CreditCardPayment());

        processor.processPayment(1200.50);
    }
}
