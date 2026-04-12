// Q7_Main.java
package Assigment_15_Generic.Q7_;

import java.util.*;

public class Q7_Main {
    public static void main(String[] args) {

        List<Integer> src = Arrays.asList(1, 2, 3);
        List<Number> dest = new ArrayList<>();

        Q7_Copy.copy(dest, src);

        System.out.println(dest);
    }
}
