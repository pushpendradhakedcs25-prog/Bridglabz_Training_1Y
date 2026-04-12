package Assigment_15_Collection.Q3_;

import java.util.*;

public class Q3_Rotate {
    public static <T> List<T> rotate(List<T> list,int k){
        List<T> res=new ArrayList<>();
        for(int i=k;i<list.size();i++) res.add(list.get(i));
        for(int i=0;i<k;i++) res.add(list.get(i));
        return res;
    }
}