package Assigment_15_Map.Q7_;

import java.util.*;

public class Map_Q7_Country {

    public static String getCapital(Map<String, String> map, String country) {
        return map.getOrDefault(country, "Unknown country");
    }
}
