package Assigment_15_Generic.Q6_;

import java.util.*;

public class Q6_Sum {
    public static double sum(List<? extends Number> list){
        double s=0;
        for(Number n:list) s+=n.doubleValue();
        return s;
    }
}
