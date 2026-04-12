package Assigment_15_Map.Q8_;

import java.util.*;

public class Map_Q8_Course {

    public static void addStudent(Map<String, Integer> map, String course) {
        map.put(course, map.getOrDefault(course, 0) + 1);
    }
}
