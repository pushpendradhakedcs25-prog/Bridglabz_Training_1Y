package Assigment_15_Map.Q9_;

import java.util.*;

public class Map_Q9_Main {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("A", 50000.0);
        map.put("B", 60000.0);

        System.out.println(Map_Q9_Salary.getAverage(map));
    }
}