package Assigment_15_Map.Q3_;

import java.util.*;

public class Map_Q3_MaxKey {

    public static String getMaxKey(Map<String, Integer> map) {

        String maxKey = null;
        int max = Integer.MIN_VALUE;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                maxKey = key;
            }
        }
        return maxKey;
    }
}