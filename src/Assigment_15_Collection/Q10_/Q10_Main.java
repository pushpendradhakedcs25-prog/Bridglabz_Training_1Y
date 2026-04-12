package Assigment_15_Collection.Q10_;

import java.util.*;

public class Q10_Main {
    public static void main(String[] args){
        Set<Integer> a=Set.of(2,3);
        Set<Integer> b=Set.of(1,2,3,4);
        System.out.println(b.containsAll(a));
    }
}