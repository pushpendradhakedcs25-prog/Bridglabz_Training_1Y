package Assigment_11;

class BankAccount {
    int acc;
    double balance;
}

class SavingsAccount extends BankAccount {
    void type() { System.out.println("Savings"); }
}

class CheckingAccount extends BankAccount {
    void type() { System.out.println("Checking"); }
}

class FixedDepositAccount extends BankAccount {
    void type() { System.out.println("FD"); }
}

public class Q8_BankHierarchy {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.type();
    }
}