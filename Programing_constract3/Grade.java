import java.util.Scanner;
    class Grate{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Physice marks ");
	double Pm = input.nextDouble();
	while(Pm>100){
		System.out.println("Please, Enter Physice marks (under 100) ");
	Pm = input.nextDouble();}
     System.out.println("Enter Chemistry marks  ");
	double Cm = input.nextDouble();
		while(Cm>100){
		System.out.println("Please, Enter Chemistry marks  (under 100) ");
	Cm = input.nextDouble();}
	System.out.println("Enter Mathematics marks ");
	double Mm = input.nextDouble();
		while(Mm>100){
		System.out.println("Please, Enter Mathematice marks  (under 100) ");
	Cm = input.nextDouble();}
	  double per =(Pm+Cm+Mm)*100/300;
	  System.out.println("PCM persentage is "+per);
	if(per>=80){
	System.out.println("Grade A");}
	else if(per>=70&&per<80){
	System.out.println("Grade B");}
	else if(per>=60&&per<70){
	System.out.println("Grade C");}
	else if(per>=50&&per<60){
	System.out.println("Grade D");}
	else{
	System.out.println("Sorry, No Grade");}
	 
	}}