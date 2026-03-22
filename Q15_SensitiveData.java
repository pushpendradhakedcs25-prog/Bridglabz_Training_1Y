package Assigment_10;

interface Sensitive {}

class User implements Sensitive {}

public class Q15_SensitiveData {
    public static void main(String[] args) {
        User u = new User();
        if(u instanceof Sensitive)
            System.out.println("Encrypt Data");
    }
}