package Assigment_15_Map.Q1_;

import java.util.*;

public class Map_Q1_WordFrequency {

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> map = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split(" ");

        for (String w : words) {
            if (w.length() > 0) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }
        return map;
    }
}