import java.util.Scanner;
class Smaller{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = input.nextInt();
		if(num%3==0){
		System.out.println("number is divisible by 3");}
		else {
		System.out.println("number is not divisible by 3");}
}}