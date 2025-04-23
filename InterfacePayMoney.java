public class InterfacePayMoney {
    
}

interface PaymentProcessor {
    boolean processPayment(double amount);

    boolean refundPayment(String transacitionId, double amount);

    boolean verifyPayment(String transacitionId);

    String getPaymentType();
}