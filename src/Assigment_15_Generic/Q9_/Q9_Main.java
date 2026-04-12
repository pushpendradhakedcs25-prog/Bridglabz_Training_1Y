// Q9_Main.java
package Assigment_15_Generic.Q9_;

public class Q9_Main {
    public static void main(String[] args) {

        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.add("Mobile");
        electronicsCart.add("Laptop");

        Cart<String> clothesCart = new Cart<>();
        clothesCart.add("Shirt");
        clothesCart.add("Jeans");

        electronicsCart.show();
        clothesCart.show();
    }
}