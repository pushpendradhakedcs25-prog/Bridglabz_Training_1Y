package Assigment_15_Map.Q6_;

import java.util.*;

public class Map_Q6_Attendance {

    public static void markAttendance(Map<String, Integer> map, List<String> present) {
        for (String name : present) {
            map.put(name, map.get(name) + 1);
        }
    }

    public static void showLowAttendance(Map<String, Integer> map, int threshold) {
        for (String name : map.keySet()) {
            if (map.get(name) < threshold) {
                System.out.println(name + " : " + map.get(name));
            }
        }
    }
}