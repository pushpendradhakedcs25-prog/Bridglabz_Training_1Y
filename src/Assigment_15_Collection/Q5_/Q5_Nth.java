package Assigment_15_Collection.Q5_;

import java.util.*;

public class Q5_Nth {
    public static <T> T find(LinkedList<T> list,int n){
        return list.get(list.size()-n);
    }
}