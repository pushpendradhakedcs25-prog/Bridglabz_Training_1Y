package Assigment_15_Map.Q12_;

import java.util.*;

public class Map_Q12_Cart {

    public static double total(Map<String, Double> map) {
        double sum = 0;
        for (double v : map.values()) sum += v;

        if (sum > 5000) sum *= 0.9;

        return sum;
    }
}
