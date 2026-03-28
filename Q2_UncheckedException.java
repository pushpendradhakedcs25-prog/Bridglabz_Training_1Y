package Assigment_12;

import java.util.InputMismatchException;

public class Q2_UncheckedException {
    public static void main(String[] args) {
       try{ int a=20;
        int b=0;
        int c=a/b ;
    }
    catch (ArithmeticException e){
        System.out.println("Input not divide by zero");}
       catch(InputMismatchException e){
           System.out.println("Invalid Exception");
       }
    }
}
