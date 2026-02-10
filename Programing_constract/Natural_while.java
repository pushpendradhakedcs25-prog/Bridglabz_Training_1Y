import java.util.Scanner;
    class Natural{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	int n = input.nextInt();
	while(n<=0){
	System.out.println("Enetr Natural number : ");
  n= input.nextInt();
}
int sum =0;
int i=1;
while(i<=n){
	sum = sum +i;
i++;}
int 	result = n*(n+1)/2 ;
if(result==sum){ System.out.println("Both Computation are correct or equal ");}
else{
System.out.println("Both Computation are not correct");}	}}