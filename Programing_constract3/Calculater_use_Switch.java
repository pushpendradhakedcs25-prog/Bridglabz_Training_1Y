import java.util.Scanner;
    class Calculater_Switch {
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number a");
	double a = input.nextDouble();
	System.out.println("Enter number b");
	double b = input.nextDouble();
	System.out.println("Enter Symbol");
	char S = input.next().charAt(0);
	switch(S){
		case '+':
		System.out.println("sum is  "+(a+b));
		break;
		case '-' :
		System.out.println("subtract is "+(a-b));
		break;
		case '*':
			System.out.println("mul is"+(a*b));
			break;
		case '/':
             	System.out.println("div is"+(a/b));	
             break ; 
         case '%' :
		      System.out.println("div is "+(a%b));	
			  break;
	default :
	System.out.println("Invalid Symbol");}
	}}