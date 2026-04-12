// Q8_Main.java
package Assigment_15_Generic.Q8_;

import java.util.*;

public class Q8_Main {
    public static void main(String[] args) {

        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        Q8_Print.print(dogs);
        Q8_Print.print(cats);
    }
}