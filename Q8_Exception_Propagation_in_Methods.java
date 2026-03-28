package Assigment_12;

public class Q8_Exception_Propagation_in_Methods {
    static void method1(){
        int a =10/0;
    }
    static void method2(){
        method1();
    }

    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handel exception  in main");
        }
    }
}
