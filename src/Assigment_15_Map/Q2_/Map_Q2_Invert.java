package Assigment_15_Map.Q2_;

import java.util.*;

public class Map_Q2_Invert {

    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> result = new HashMap<>();

        for (K key : map.keySet()) {
            V value = map.get(key);

            result.putIfAbsent(value, new ArrayList<>());
            result.get(value).add(key);
        }
        return result;
    }
}