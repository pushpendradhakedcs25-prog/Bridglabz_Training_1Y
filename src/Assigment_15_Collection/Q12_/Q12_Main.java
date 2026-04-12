package Assigment_15_Collection.Q12_;

import java.util.*;

public class Q12_Main {
    public static void main(String[] args){
        Queue<String> q=new LinkedList<>();
        q.add("1");

        for(int i=0;i<5;i++){
            String s=q.poll();
            System.out.println(s);
            q.add(s+"0");
            q.add(s+"1");
        }
    }
}