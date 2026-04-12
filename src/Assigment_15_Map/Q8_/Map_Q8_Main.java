package Assigment_15_Map.Q8_;

import java.util.*;

public class Map_Q8_Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("CS101", 40);

        Map_Q8_Course.addStudent(map, "CS101");

        System.out.println(map);
    }
}