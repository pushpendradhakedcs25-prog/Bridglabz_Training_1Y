import java.util.Scanner;
    class Season{
	public static void main(String []args){
	Scanner input = new Scanner (System.in);
	System.out.println("Enetre moth(starting charcter capital): ");
	String mon = input.nextLine();
	
	System.out.println("Enter day");
	int day = input.nextInt();
	boolean ans = false ;
	if(mon.equals("March")){
		if(day>=20&&day<=31){
	ans = true ;}}
	else if(mon.equals("April")){
		if(day>=1&&day<=30){
	      ans = true;
	}}
	else if(mon.equals("May")){
		if(day>=1&&day<=31)  ans = true ;
	}}
	else if(mon.equals("June")){
		if(day>=1&&day<=20){
	ans = true;}}
	if(ans){ System.out.println("SpringSeason is allowed");}
	else{
	System.out.println("Spring Season is not allowed");}}