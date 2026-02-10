import java.util.Scanner;
    class Factor{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int n = input.nextInt();
	int greatestfact=1;
        for(int i=n-1; i>=1; i--){
		if(n%i==0){greatestfact =i;
		break;}}
		System.out.println("Gratest of given number is " +greatestfact);
		}}