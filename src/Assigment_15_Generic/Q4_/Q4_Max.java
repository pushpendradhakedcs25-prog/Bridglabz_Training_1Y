package Assigment_15_Generic.Q4_;

public class Q4_Max {
    public static <T extends Comparable<T>> T max(T a, T b , T c){
        T m =a;
     if(b.compareTo(m)>0){ m=b;}
         if( c.compareTo(m)>0){ m =c;}
         return m;
    }}
