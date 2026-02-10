import java.util.Scanner;
class Zero{
public static void main(String []args){
	Scanner input = new Scanner(System.in);
	double total = 0.0;
	System.out.println("Enter number");
	double num =input.nextDouble();
	
	       while(num !=0){
			   total = total + num;
			   System.out.println("Eneter number zero to go stop");
			   num = input.nextDouble();
		   }
System.out.println("Total sum is "+total);}}