package Assigment_15_Map.Q5_;

import java.util.*;

public class Map_Q5_Main {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        System.out.println(Map_Q5_Group.group(list));
    }
}