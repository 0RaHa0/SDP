package Task_41;

class CreditCardPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class CryptoPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Cryptocurrency.");
    }
}
