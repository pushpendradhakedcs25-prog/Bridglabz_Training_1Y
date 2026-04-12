package Assigment_15_Generic.Q13_;

class Book extends Product {}
class Clothing extends Product {}

public class Q13_Main {
    public static void main(String[] args) {

        Book b = new Book();
        b.price = 500;

        Clothing c = new Clothing();
        c.price = 1000;

        Discount.applyDiscount(b, 10);
        Discount.applyDiscount(c, 20);

        System.out.println(b.price);
        System.out.println(c.price);
    }
}
