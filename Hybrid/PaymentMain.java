package Hybrid;

interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount);
    }
}

class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: " + amount);
    }
}
public class PaymentMain {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardProcessor();
        PaymentProcessor paypal = new PayPalProcessor();

        creditCard.processPayment(100.0);
        paypal.processPayment(200.0);
    }
}