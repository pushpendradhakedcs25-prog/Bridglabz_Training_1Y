package Assigment_15_Map.Q14_;

import java.util.*;

public class Map_Q14_Result {

    public static void topStudent(Map<String, Map<String, Integer>> data) {

        for (String subject : data.keySet()) {
            Map<String, Integer> marks = data.get(subject);

            String top = null;
            int max = 0;

            for (String student : marks.keySet()) {
                if (marks.get(student) > max) {
                    max = marks.get(student);
                    top = student;
                }
            }
            System.out.println(subject + " Topper: " + top);
        }
    }
}