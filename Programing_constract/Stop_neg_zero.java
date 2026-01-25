import java.util.Scanner;
    class stop{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int n = input.nextInt();
int total =0;
while(n>0){
	System.out.println("Enter number  negative or zeroth  to stop ");
	n= input.nextInt();
total=total+n;
}
System.out.println("Toatl is " +total);
	}}
	
