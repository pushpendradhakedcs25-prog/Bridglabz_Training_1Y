package Assigment_15_Map.Q11_;

import java.util.*;

public class Map_Q11_Main {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();

        Map_Q11_Bank.deposit(map, "A1", 5000);
        Map_Q11_Bank.withdraw(map, "A1", 2000);

        System.out.println(map);
    }
}