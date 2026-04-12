package Assigment_15_Collection.Q1_;

import java.util.*;

public class Q1_Reverse {
    public static <T> List<T> reverse(List<T> list){
        List<T> res=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--)
            res.add(list.get(i));
        return res;
    }
}