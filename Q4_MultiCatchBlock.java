package Assigment_12;

import java.util.Scanner;

public class Q4_MultiCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr =null;
        try{
            System.out.println("Enter index: ");
            int index = sc.nextInt();
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is not Valid");
        }
        catch (NullPointerException e){
            System.out.println("Array not initiallized ");
        }
    }
}
