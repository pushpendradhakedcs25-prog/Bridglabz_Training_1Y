package Assigment_15_Generic.Q7_;

import java.util.*;

public class Q7_Copy {
    public static void copy(List<? super Number> dest,
                            List<? extends Number> src){
        for(Number n:src) dest.add(n);
    }
}
