package Assigment_15_Collection.Q14_;

import java.util.*;

class MyStack{
    Queue<Integer> q=new LinkedList<>();

    void push(int x){
        q.add(x);
        for(int i=0;i<q.size()-1;i++)
            q.add(q.poll());
    }

    int pop(){
        return q.poll();
    }
}

public class Q14_Main {
    public static void main(String[] args){
        MyStack s=new MyStack();
        s.push(1);
        s.push(2);

        System.out.println(s.pop());
    }
}