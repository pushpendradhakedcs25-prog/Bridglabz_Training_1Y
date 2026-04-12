package Assigment_15_Collection.Q11_;

import java.util.*;

public class Q11_Main {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>(Arrays.asList(10,20,30));
        Stack<Integer> st=new Stack<>();

        while(!q.isEmpty()) st.push(q.poll());
        while(!st.isEmpty()) q.add(st.pop());

        System.out.println(q);
    }
}