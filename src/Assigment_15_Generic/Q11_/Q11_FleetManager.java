package Assigment_15_Generic.Q11_;

import java.util.*;

class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}

public class Q11_FleetManager<T extends Vehicle>{
    List<T> list=new ArrayList<>();

    void add(T v){ list.add(v); }
    void show(){ System.out.println(list); }
}