import java.util.Scanner;
    class Salary{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter salary");
	double salary = input.nextDouble();
	System.out.println("Eneter years of rervece");
	int year = input.nextInt();
	   if(year>5){
	   System.out.println("Bonous amount "+(salary*0.05));}
	   else{
	   System.out.println("not eligible for bonous");}}}