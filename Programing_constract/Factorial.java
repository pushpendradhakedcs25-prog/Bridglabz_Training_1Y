import java.util.Scanner;
    class  Fact{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int n = input.nextInt();
	while(n<0){
	System.out.println("Please enter positive number ");
	 n= input.nextInt();
	}
	int fact =1;
	int i =1;
	while(i<=n){
		fact*=i;
		i++;
	}
	
	System.out.println("Factorial is "+fact);}}