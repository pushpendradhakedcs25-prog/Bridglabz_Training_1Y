package Assigment_15_Map.Q10_;

import java.util.*;

public class Map_Q10_Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        Map_Q10_Tracker.visit(map, "home");
        Map_Q10_Tracker.visit(map, "home");
        Map_Q10_Tracker.visit(map, "about");

        System.out.println(map);
    }
}