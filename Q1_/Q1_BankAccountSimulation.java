package Assigment_13.Q1_;

public class Q1_BankAccountSimulation {
    public static void main(String[] args) {
        Thread premium = new Thread(new BankAccountUser("Premium"));
        Thread regular = new Thread(new BankAccountUser("Regular"));
        Thread basic = new Thread(new BankAccountUser("Basic"));

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}
