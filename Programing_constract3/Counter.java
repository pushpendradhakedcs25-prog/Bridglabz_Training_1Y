import java.util.Scanner;
    class Counter{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int n = input.nextInt();
	while(n<=0){
	          System.out.println("Enter number is not negative or zero");
			  n= input.nextInt();}
			  int ld;
			  int count =0;
			while(n>0){
			          ld= n%10;
					  count +=1;
					  n=n/10;}
				
System.out.println("Number  of  digit is "+count);
	}}