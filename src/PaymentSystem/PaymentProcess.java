package PaymentSystem;

public class PaymentProcess {
    private PaymentSystem payment;


    public void setPaymentStrategy(PaymentSystem payment) {
        this.payment = payment;
    }
    public boolean makePayment(double amount) {
        if (payment == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        return payment.pay(amount);
    }
    public static void main(String[] args) {
        PaymentSystem payment = new PaymentSystem();


    }
