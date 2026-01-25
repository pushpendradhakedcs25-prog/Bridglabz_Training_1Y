import java.util.Scanner;
    class Factor{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number is  lessss than 100 :");
	int n = input.nextInt();
	while(n>100){
		System.out.println("Please, Enter number is  lessss than 100 :");
	n = input.nextInt();}
	
	int greatestfact=1;
        int i=n-1;
while(i>=1){
		if(n%i==0){
		greatestfact =i;
		break;
		}
		i--;}
		System.out.println("Gratest of given number is " +greatestfact);
		}}