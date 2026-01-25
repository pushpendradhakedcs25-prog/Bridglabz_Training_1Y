import java.util.Scanner;
class AgeHeigth{
public static void main(String agrs[]){
Scanner input = new Scanner (System.in);
int age ;
int heigth;
System.out.println("Enter Amaar age&heugth  ");
int a1 = input.nextInt();
int h1 =  input.nextInt();

System.out.println("Enter Akbar age&heugth  ");
int a2 = input.nextInt();
int h2 =  input.nextInt();

System.out.println("Enter Anthani age&heugth  ");
int a3 = input.nextInt();
int h3 =  input.nextInt();

if(a2<a1&&a3<a1){ System.out.println(" Ammar is  youngest person with age "+a1); }
else if(a1<a2&&a3<a2){ System.out.println(" Akbar is  youngest person with age "+a2);}
else{ System.out.println(" Anthani is  youngest person with age "+a3);}

if(h2<h1&&h3<h1){ System.out.println(" Ammar is  tallest person with heigth "+h1);  }
else if(h1<h2&&h3<h2){ System.out.println("Akbar is  tallest person with heigth "+h2);}
else{ System.out.println(" Anthani is  tallest person with heigth "+h3);}

}}

