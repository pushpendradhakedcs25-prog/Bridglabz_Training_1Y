import java.util.Scanner;
class Divisible{
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
System.out.println("Enter number");
int num = input.nextInt();
while(num<=0){
System.out.println("Enter possitive number");
num = input.nextInt();
}
int i=1;
while( i<=num){ 
if(num%i==0){  System.out.println("True"+i);
i++;}
}}}