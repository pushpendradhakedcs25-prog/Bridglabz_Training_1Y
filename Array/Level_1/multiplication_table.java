import java.util.Scanner;
class multi{
         public static void main(String [] agrs){
			  Scanner sc = new Scanner(System.in);
			  int [ ]arr = new int[10];
			  System.out.println("Entre number ");
			  int a = sc.nextInt();
			  System.out.println("multiplication table is ");
			  for(int i=0; i<arr.length; i++){
			  arr[i]  =a*(i+1);
			  System.out.println(a+ " * " +(i+1)+" = "+arr[i]);}
}}
			  