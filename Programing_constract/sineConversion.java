import java.util.Scanner;
    class conversion{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int num= input.nextInt();
     if(num>0)  System.out.println("positive");
else if(num<0)System.out.println("Negative");
else{ System.out.println("Zero");}	 
	}}