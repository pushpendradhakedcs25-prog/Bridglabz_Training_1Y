package Assigment_10;

interface PaymentProcessor {
    void pay();

    default void refund() {
        System.out.println("Refund processed");
    }
}

class Paytm implements PaymentProcessor {
    public void pay() {
        System.out.println("Payment done");
    }
}

public class Q10_PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor p = new Paytm();
        p.pay();
        p.refund();
    }
}