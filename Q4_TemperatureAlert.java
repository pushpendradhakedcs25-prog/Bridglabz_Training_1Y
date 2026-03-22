package Assigment_10;

import java.util.function.Predicate;

public class Q4_TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> alert = t -> t > 30;
        System.out.println(alert.test(35.0));
    }
}