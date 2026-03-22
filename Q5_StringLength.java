package Assigment_10;

import java.util.function.Function;

public class Q5_StringLength {
    public static void main(String[] args) {
        Function<String,Integer> f = s -> s.length();
        System.out.println(f.apply("Hello"));
    }
}
