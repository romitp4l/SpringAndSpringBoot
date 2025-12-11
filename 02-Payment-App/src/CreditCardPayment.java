public class CreditCardPayment implements IPayment{

    @Override
    public boolean pay(double amount) {

        System.out.println("Credit card Payment in progress");
        return true;
    }
}
