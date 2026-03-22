

package Assigment_9;

abstract class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() { return price; }

    abstract double discount();
}

interface Taxable {
    double tax();
}

class Electronics extends Product implements Taxable {
    public Electronics(double p) { super(p); }
    double discount() { return getPrice()*0.1; }
    public double tax() { return getPrice()*0.18; }
}

class Clothing extends Product {
    public Clothing(double p) { super(p); }
    double discount() { return getPrice()*0.2; }
}

class Groceries extends Product {
    public Groceries(double p) { super(p); }
    double discount() { return 0; }
}

public class Q2_ECommerce {
    public static void main(String[] args) {
        Product p = new Electronics(50000);
        System.out.println(p.getPrice() + ((Taxable)p).tax() - p.discount());
    }
}
