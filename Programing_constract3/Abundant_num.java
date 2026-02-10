 import java.util.Scanner;
    class Abundant{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int n = input.nextInt();
	int ld ;
	int sum=0;
       while (n>0){
	   ld = n%10;
	   sum+=ld;
	   n=n/10;}
	   if(sum>n){ System.out.println("It's Abundant number ");}
	   else{  System.out.println("It's not Abundant number");}
	}}