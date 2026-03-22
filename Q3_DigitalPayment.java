package Assigment_10;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via Card: " + amount);
    }
}

public class Q3_DigitalPayment {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(1000);
    }
}