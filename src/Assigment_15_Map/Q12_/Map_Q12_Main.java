package Assigment_15_Map.Q12_;

import java.util.*;

public class Map_Q12_Main {
    public static void main(String[] args) {

        Map<String, Double> cart = new LinkedHashMap<>();
        cart.put("Laptop", 4000.0);
        cart.put("Mobile", 2000.0);

        System.out.println(Map_Q12_Cart.total(cart));
    }
}