package Assigment_15_Map.Q13_;

import java.util.*;

public class Map_Q13_Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "IT");
        map.put(2, "HR");

        Map_Q13_Department.printByDept(map, "IT");
    }
}