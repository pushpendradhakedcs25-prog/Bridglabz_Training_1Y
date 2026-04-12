package Assigment_15_Generic.Q9_;

import java.util.*;

public class Cart<T> {
    List<T> items=new ArrayList<>();

    void add(T i){ items.add(i); }
    void remove(T i){ items.remove(i); }
    void show(){ System.out.println(items); }
}