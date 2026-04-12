package Assigment_15_Map.Q5_;

import java.util.*;

class Employee {
    String name, dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String toString() {
        return name;
    }
}

public class Map_Q5_Group {

    public static Map<String, List<Employee>> group(List<Employee> list) {

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : list) {
            map.putIfAbsent(e.dept, new ArrayList<>());
            map.get(e.dept).add(e);
        }
        return map;
    }
}