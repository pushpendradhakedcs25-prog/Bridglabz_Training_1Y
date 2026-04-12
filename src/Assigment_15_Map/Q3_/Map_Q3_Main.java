package Assigment_15_Map.Q3_;

import java.util.*;

public class Map_Q3_Main {
    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);

        System.out.println(Map_Q3_MaxKey.getMaxKey(map));
    }
}
