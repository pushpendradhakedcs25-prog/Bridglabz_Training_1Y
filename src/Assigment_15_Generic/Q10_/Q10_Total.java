package Assigment_15_Generic.Q10_;

import java.util.*;

class Product {
    double price;
    double getPrice(){ return price; }
}

public class Q10_Total {
    public static double total(List<? extends Product> list){
        double t=0;
        for(Product p:list) t+=p.getPrice();
        return t;
    }
}