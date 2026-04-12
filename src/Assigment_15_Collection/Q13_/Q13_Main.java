package Assigment_15_Collection.Q13_;

import java.util.*;

class Patient implements Comparable<Patient>{
    String name; int priority;

    Patient(String n,int p){
        name=n; priority=p;
    }

    public int compareTo(Patient o){
        return o.priority-this.priority;
    }
}

public class Q13_Main {
    public static void main(String[] args){
        PriorityQueue<Patient> pq=new PriorityQueue<>();

        pq.add(new Patient("John",3));
        pq.add(new Patient("Alice",5));

        while(!pq.isEmpty())
            System.out.println(pq.poll().name);
    }
}