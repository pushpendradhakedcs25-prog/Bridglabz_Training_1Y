package Assigment_15_Map.Q2_;

import java.util.*;

public class Map_Q2_Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        System.out.println(Map_Q2_Invert.invert(map));
    }
}