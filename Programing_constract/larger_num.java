import java.util.Scanner;
    class larger{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number1");
	int num1 = input.nextInt();
	System.out.println("Enter number2");
	int num2 = input.nextInt();
	System.out.println("Enter number3");
	int num3 = input.nextInt();
	
	if(num1>=num2&&num1>=num3){  System.out.println("Number1("+num1+") is larger");}
	else if(num2>=num1&&num2>=num3){ System.out.println("Number2("+num2+")is larger");}
	else{System.out.println("Number3("+num3+")is larger");}}}