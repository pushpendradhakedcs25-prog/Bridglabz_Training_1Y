import java.util.Scanner;
    class Harshad_num{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int n = input.nextInt();
	int ld;
	int sum=0;
	 int original = n;
while(n>0){
 ld = n%10;
 sum = sum+ld;
 n=n/10;}
             
			     if(original%sum==0){ System.out.println(" It is Harshad number ");}
				 else{ System.out.println(" It's  not Harshad number ");}
	}}