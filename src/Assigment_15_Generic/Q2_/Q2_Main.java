package Assigment_15_Generic.Q2_;

public class Q2_Main {
    public static void main(String[] args) {
        Q2_GenericPair<Integer, String> student = new Q2_GenericPair<>(16, "Pushpendra");
        System.out.println(student.getFirst());
        System.out.println(student.getSecond());
    }
}
