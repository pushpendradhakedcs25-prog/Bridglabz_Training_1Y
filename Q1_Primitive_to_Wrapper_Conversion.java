package Assignment_14;

import java.util.Scanner;

public class Q1_Primitive_to_Wrapper_Conversion {
    public void primitiveToWapper(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Integer num2 = num1;
        System.out.println("Primitive :-"+num1);
        System.out.println("Wrapper :-"+num2);
    }

    public static void main(String[] args) {
        Q1_Primitive_to_Wrapper_Conversion q1= new Q1_Primitive_to_Wrapper_Conversion();
        q1.primitiveToWapper();
    }}
