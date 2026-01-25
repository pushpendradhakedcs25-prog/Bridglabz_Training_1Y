import java.util.Scanner;
    class LeapYear{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter year");
	int Y = input.nextInt();
	while(Y<1582){
	System.out.println("Please Enter more than or equal to 1582");
	Y= input.nextInt();}
if(Y%4==0&&Y%400==0||Y%100!=0){
System.out.println("Year is leapYear");}
else{
System.out.println("Year is not leapYear");}
	}}