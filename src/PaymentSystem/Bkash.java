package PaymentSystem;

class Bkash implements PaymentSystem {
    @Override
    public boolean pay(double amount) {
        System.out.println(" payment done using Bank");

        return true;
    }
}
