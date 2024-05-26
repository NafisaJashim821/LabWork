package PaymentSystem;

class CreditCardPayment implements PaymentSystem {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using Credit Card");

        return true;
    }
}
