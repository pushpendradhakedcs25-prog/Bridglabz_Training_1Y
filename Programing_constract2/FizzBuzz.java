import java.util.Scanner;
class FizzBuzz{
public static void main(String agrs[]){
Scanner input = new Scanner (System.in);
System.out.println("Enter number ");
int num = input.nextInt();
while(num%3!=0&&num%5!=0){
 System.out.println("Enter number possitive");
    num = input.nextInt();
	}
	if(num%3==0){
	System.out.println("Fizz");
	}
	else if (num%5==0){
	System.out.println("Buzz");}
	else{
	System.out.println("FizzBuzz");}
	}}