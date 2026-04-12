package Assigment_15_Map.Q13_;

import java.util.*;

public class Map_Q13_Department {

    public static void printByDept(Map<Integer, String> map, String dept) {
        for (Integer id : map.keySet()) {
            if (map.get(id).equals(dept)) {
                System.out.println(id);
            }
        }
    }
}