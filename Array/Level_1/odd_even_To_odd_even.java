import java.util.Scanner;
class Evenodd{
    public static void main(String args[ ]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int num = sc.nextInt();
	if(num<=0){
		System.out.println("entre positive number ");
	return ;}
	int [] even = new int [num];
	int []odd = new int [num];
	int a=0;
	int b=0;
	for(int i=1; i<=num; i++){
		if(i%2==0){
			even[a]=i;
		a++;}
		else{
			odd[b]=i;
	b++;}}
	      System.out.println("odd number ");
		  for(int i=0; i<b; i++){
			  System.out.print(odd[i]+" ");
		  }
		  System.out.println("\nEven number");
		  for(int i=0;  i<a; i++){
	System.out.print(even[i]+" ");}}}
			  
			