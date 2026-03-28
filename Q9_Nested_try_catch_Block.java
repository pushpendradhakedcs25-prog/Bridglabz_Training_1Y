package Assigment_12;

import java.util.Scanner;

public class Q9_Nested_try_catch_Block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr ={10,20,30};
        try{
            int division = sc.nextInt();
            int index= sc.nextInt();
            try{
                System.out.println(arr[index]/division);
            }
            catch (ArithmeticException e){
                System.out.println("Cannot divide by Zero ");
            }}
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid !index Array");
            }
        }
    }

