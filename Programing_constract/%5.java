import java.util.Scanner;
class D5 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num");
		int num = input.nextInt();
		if(num%5==0){
			System.out.println(num+"is divisible by 5");
		}
		else{
			System.out.println("Enter num is  not verift it");
		}
}}
		