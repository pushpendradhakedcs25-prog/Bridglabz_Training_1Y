package Assigment_15_Map.Q4_;

import java.util.*;

public class Map_Q4_Main {
    public static void main(String[] args) {

        Map<String, Integer> m1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> m2 = Map.of("B", 3, "C", 4);

        System.out.println(Map_Q4_Merge.merge(m1, m2));
    }
}