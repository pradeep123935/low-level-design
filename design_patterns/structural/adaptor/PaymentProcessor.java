package design_patterns.structural.adaptor;

public interface PaymentProcessor {
    void processPayment(double amount, String currency);

    boolean isPaymentSuccessful();

    String getTransactionId();
}