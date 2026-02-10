import java.util.Scanner;
    class Prime {
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int n = input.nextInt();
	boolean ans=true;
	  if(n<=1){
	          ans = false;}
			  else{
				  for(int i=2; i<n; i++){
			  if(n%i==0){
			  ans =false;
			  break;}}}
			  if(ans){
			  System.out.println("Enter num is prime number ");}
			  else{
			  System.out.println("Enter num is not prime number ");}
	  }}