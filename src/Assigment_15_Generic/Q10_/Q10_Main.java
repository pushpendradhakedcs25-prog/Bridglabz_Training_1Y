// Q10_Main.java
package Assigment_15_Generic.Q10_;

import java.util.*;

class Mobile extends Product {
    Mobile(double p) { price = p; }
}

public class Q10_Main {
    public static void main(String[] args) {

        List<Mobile> list = Arrays.asList(
                new Mobile(10000),
                new Mobile(20000)
        );

        System.out.println(Q10_Total.total(list));
    }
}
