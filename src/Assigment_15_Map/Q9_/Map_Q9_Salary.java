package Assigment_15_Map.Q9_;

import java.util.*;

public class Map_Q9_Salary {

    public static double getAverage(Map<String, Double> map) {
        return map.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}