package Assigment_15_Generic.Q1_;

public class Q1_Main {
    public static void main(String[] args) {
       Q1_GenericBox<Integer> IntBox = new Q1_GenericBox<>();
       IntBox.setValue(6);
        System.out.println(IntBox.getValue());
       Q1_GenericBox<String> strBox= new Q1_GenericBox<>();
       strBox.setValue("Hello");
        System.out.println(strBox.getValue());
       Q1_GenericBox doubBox = new Q1_GenericBox<>();
       doubBox.setValue(33.22);
        System.out.println(doubBox.getValue());
    }
}