package PaymentSystem;

class Bank implements PaymentSystem {
    @Override
    public boolean pay(double amount) {
        System.out.println(" Payment done using Bank");

        return true;
    }
}

