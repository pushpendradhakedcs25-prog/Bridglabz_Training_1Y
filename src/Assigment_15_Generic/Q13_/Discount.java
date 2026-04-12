package Assigment_15_Generic.Q13_;

class Product {
    double price;
}

public class Discount {

    public static <T extends Product> void applyDiscount(T product, double percentage) {
        product.price -= product.price * percentage / 100;
    }
}
