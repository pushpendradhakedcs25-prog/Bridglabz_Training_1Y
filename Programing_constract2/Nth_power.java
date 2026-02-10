import java.util.Scanner;
    class nthPower{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int n = input.nextInt();
	System.out.println("enter number of power");
	int p = input.nextInt();
	int result =1;
for( int i=1; i <=p; i++){
result=n*result;}
System.out.println("result is "+result);
	}}