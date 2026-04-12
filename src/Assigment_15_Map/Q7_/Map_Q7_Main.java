package Assigment_15_Map.Q7_;

import java.util.*;

public class Map_Q7_Main {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("India", "Delhi");
        map.put("USA", "Washington");

        System.out.println(Map_Q7_Country.getCapital(map, "India"));
        System.out.println(map);
    }
}