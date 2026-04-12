package Assigment_15_Collection.Q2_;

import java.util.*;

public class Q2_Frequency {
    public static Map<String,Integer> count(List<String> list){
        Map<String,Integer> map=new HashMap<>();
        for(String s:list)
            map.put(s,map.getOrDefault(s,0)+1);
        return map;
    }
}
