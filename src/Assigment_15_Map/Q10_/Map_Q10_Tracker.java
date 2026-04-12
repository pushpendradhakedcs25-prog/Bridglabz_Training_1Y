package Assigment_15_Map.Q10_;

import java.util.*;

public class Map_Q10_Tracker {

    public static void visit(Map<String, Integer> map, String page) {
        map.put(page, map.getOrDefault(page, 0) + 1);
    }
}