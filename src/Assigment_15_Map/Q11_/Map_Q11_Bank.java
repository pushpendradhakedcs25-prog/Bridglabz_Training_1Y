package Assigment_15_Map.Q11_;

import java.util.*;

public class Map_Q11_Bank {

    public static void deposit(Map<String, Double> map, String acc, double amt) {
        map.put(acc, map.getOrDefault(acc, 0.0) + amt);
    }

    public static void withdraw(Map<String, Double> map, String acc, double amt) {
        if (map.getOrDefault(acc, 0.0) >= amt) {
            map.put(acc, map.get(acc) - amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}