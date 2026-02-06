import java.util.Scanner;
class Oddeven{
	         public static void main(String args[]){
				 Scanner sc =new Scanner(System.in);
				 System.out.println("Entre numebr");
				 int num=sc.nextInt();
				      if(num<=0){
						  System.out.println("Entre possitive number");
					 
					  return ;}
					  int []even = new int[num/2 + 1];
					  int []odd = new int[num/2+1];
					  int evenindex=0;
					  int oddindex=0;
					  for(int i=1; i<=num; i++){
						  if(i%2==0){
						  even[evenindex]=i;
						  evenindex++;}
						  else{   odd[oddindex]=i;
					  oddindex++;}}
					 System.out.println("Odd number");
					 for(int i=0; i<oddindex; i++){
					 System.out.print(odd[i]+" ");}
					 System.out.println("\nEven number");
					 for(int i=0; i<evenindex; i++){
System.out.print(even[i]+" ");}}}