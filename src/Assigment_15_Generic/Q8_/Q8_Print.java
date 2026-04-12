package Assigment_15_Generic.Q8_;

import java.util.*;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class Q8_Print {
    public static void print(List<? extends Animal> list){
        System.out.println(list);
    }
}