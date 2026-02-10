import java.util.Scanner;
    class Amstrong {
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int n = input.nextInt();
	while(n<=0){
	System.out.println("Enter number is not negative and zero");
	 n= input.nextInt();}
	 
	int atg=0;
	int ld;
while(n>0){
        ld = n%10;
atg=atg+ld*ld*ld ;
n= n/10;}
System.out.println("Amstrong of given number is "+atg);
	}}