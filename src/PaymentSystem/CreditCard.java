package PaymentSystem;

class CreditCardPayment implements PaymentSystem {
    @Override
    public boolean pay(double amount) {
        System.out.println(" payment done using the Credit Card");

        return true;
    }
}
