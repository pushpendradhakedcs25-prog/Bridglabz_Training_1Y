package Assigment_15_Map.Q14_;

import java.util.*;

public class Map_Q14_Main {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> data = new HashMap<>();

        Map<String, Integer> math = new HashMap<>();
        math.put("A", 90);
        math.put("B", 80);

        data.put("Math", math);

        Map_Q14_Result.topStudent(data);
    }
}