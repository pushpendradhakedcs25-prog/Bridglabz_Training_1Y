package Assigment_12;

public class Q6_Throw_Throws {
    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if(amount <0 || rate<0){ throw new IllegalArgumentException();}
        return (rate*amount*years)/100;
    }

    public static void main(String[] args) {
        try{
            System.out.println(calculateInterest(1000,5,2));
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid input: rate,Amount must be positive ");
        }
    }
}
