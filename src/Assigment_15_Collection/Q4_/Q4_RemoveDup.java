package Assigment_15_Collection.Q4_;

import java.util.*;

public class Q4_RemoveDup {
    public static <T> List<T> remove(List<T> list){
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
