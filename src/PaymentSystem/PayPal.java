package PaymentSystem;

class PayPal implements PaymentSystem {
    @Override
    public boolean pay(double amount) {
        System.out.println(" payment done using the PayPal");

        return true;
    }
}

