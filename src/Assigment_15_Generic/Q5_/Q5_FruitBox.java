package Assigment_15_Generic.Q5_;

class Q5_Fruit { String name; }
class Apple extends Q5_Fruit {}
class Mango extends Q5_Fruit {}

public class Q5_FruitBox<T extends Q5_Fruit>{
    T item;
    void add(T i){ item=i; }
    void show(){ System.out.println(item); }
}