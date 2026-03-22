package Assigment_9;

abstract class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() { return balance; }

    void deposit(double a) { balance += a; }
    void withdraw(double a) { balance -= a; }

    abstract double interest();
}

interface Loanable {
    void loan();
}

class Savings extends Account implements Loanable {
    public Savings(double b) { super(b); }
    double interest() { return getBalance()*0.05; }
    public void loan() {}
}

class Current extends Account {
    public Current(double b) { super(b); }
    double interest() { return 0; }
}

public class Q4_BankingSystem {
    public static void main(String[] args) {
        Account a = new Savings(10000);
        System.out.println(a.interest());
    }
}