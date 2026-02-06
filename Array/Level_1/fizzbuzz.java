import java.util.*;
      class FIZZBUZZ{
		   public static void main(String arg[]){
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Enter possitive  number");
                int num = sc.nextInt();
                    if(num<=0){
						 System.out.println("Sorry");
					return ;}
					 if(num%3==0&&num%5==0){
		System.out.println("FIZZBUZZ");}
       else if(num%3==0){
		System.out.println("FIZZ");}
		 else if(num%5==0){
		System.out.println("BUZZ");}
		
	  else{ 	System.out.println("Invalid Statement");}}}