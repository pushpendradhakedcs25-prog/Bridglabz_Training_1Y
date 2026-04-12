package Assigment_15_Collection.Q8_;

import java.util.*;

public class Q8_Main {
    public static void main(String[] args){
        Set<Integer> a=new HashSet<>(Set.of(1,2,3));
        Set<Integer> b=new HashSet<>(Set.of(3,4,5));

        Set<Integer> res=new HashSet<>(a);
        res.addAll(b);

        Set<Integer> temp=new HashSet<>(a);
        temp.retainAll(b);

        res.removeAll(temp);
        System.out.println(res);
    }
}