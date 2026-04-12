package Assigment_15_Collection.Q9_;

import java.util.*;

public class Q9_Main {
    public static void main(String[] args){
        Set<Integer> set=new HashSet<>(Set.of(5,2,8,1));
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}