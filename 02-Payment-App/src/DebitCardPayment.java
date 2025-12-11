public class DebitCardPayment implements IPayment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Debit Card Payment in progress");
        return true;
    }
}
