package Assigment_15_Generic.Q16_;

import java.util.*;

abstract class JobRole {}

public class Resume<T extends JobRole> {
    T role;

    public void setRole(T role) {
        this.role = role;
    }

    public static void process(List<? extends JobRole> list) {
        System.out.println(list);
    }
}
