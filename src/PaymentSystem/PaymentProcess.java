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
        PaymentProcess paymentProcess = new PaymentProcess();


        paymentProcess.setPaymentStrategy(new Bank());
        System.out.println("Bank  " + paymentProcess.makePayment(200));

        paymentProcess.setPaymentStrategy(new Bkash());
        System.out.println("Bkash payment  " +paymentProcess.makePayment(500);

        paymentProcess.setPaymentStrategy(new CreditCardPayment());
        System.out.println("CreditCard : " + paymentProcess.makePayment(5500));


    }
}