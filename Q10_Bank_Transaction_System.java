package Assigment_12;

import javax.naming.InsufficientResourcesException;

public class Q10_Bank_Transaction_System {
    double balance = 20000;
    void withdraw(double amount ) throws InsufficientResourcesException{
        if(amount > balance ) throw new InsufficientResourcesException();
        if(amount <0) throw  new IllegalArgumentException();
        balance -=amount ;
        System.out.println("After withdaw througth Account Balance is "+balance);
    }

    public static void main(String[] args) {
        Q10_Bank_Transaction_System obj = new Q10_Bank_Transaction_System();
        try{
            obj.withdraw(500);
        }
        catch (InsufficientResourcesException e){
            System.out.println("Insufficient Balance");
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid Amount ");
        }

    }
}
