import java.util.Scanner;
       class Multiple{
	   public static void main (String agrs[]){
	   Scanner  input = new Scanner(System.in);
	   System.out.println("Entre number");
	   int num = input.nextInt();
	   int mult;
	        while(num<6||num>9){
			System.out.println("Enter number from 6 to 9 ");
			num =input.nextInt();}
			System.out.println("Start multiple table for " +num);
			for(int i=1 ; i<10; i++){
			mult = num*i; 
			System.out.println(mult);}
			}}
	   