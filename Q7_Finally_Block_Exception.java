package Assigment_12;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Q7_Finally_Block_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("complete Process ");
        }
    }
}