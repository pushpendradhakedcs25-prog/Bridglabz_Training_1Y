package com.GLA.Array;

import java.util.Scanner;

public class Calculator1 {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Calculator1 c1 = new Calculator1();

        int addition = c1.add(a, b);
        System.out.println("Addition of two numbers: " + addition);

        int subtraction = c1.sub(a, b);
        System.out.println("Subtraction of two numbers: " + subtraction);

        int multiplication = c1.mul(a, b);
        System.out.println("Multiplication of two numbers: " + multiplication);

        if (b != 0) {
            int division = c1.div(a, b);
            System.out.println("Division of two numbers: " + division);
        } else {
            System.out.println("Division not possible (cannot divide by zero)");
        }

        sc.close();
    }
}
