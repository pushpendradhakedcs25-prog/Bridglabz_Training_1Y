import java.util.Scanner;
    class Nature {
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int n = input.nextInt();
	for(int i=1; i<=n; i++){
	
           if(i%2==0){
		   System.out.println("num "+i+" even");}
		   else{
		   System.out.println("num"+i+" odd");}
	}}}