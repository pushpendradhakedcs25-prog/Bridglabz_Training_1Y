package Assigment_15_Generic.Q2_;

public class Q2_GenericPair <T,M>{
    private T first;
    private M second;
    public Q2_GenericPair(T first,M second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public M getSecond(){
        return second;
    }
}
