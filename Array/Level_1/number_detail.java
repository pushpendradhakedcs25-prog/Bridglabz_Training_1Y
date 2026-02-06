
				import java.util.Scanner;
class Number{
	     public static void main (String [] args){
			      Scanner sc = new Scanner(System.in);
				  int [ ] arr= new int[5];
				  for(int i=0; i<arr.length; i++){
					       arr[i]=sc.nextInt();
						   if(arr[i]<0){
							   System.out.println("negative ");
						   }
						   else if (arr[i]>0){
							   System.out.println("Possitive After that ...");
							               if(arr[i]%2==0){
										   System.out.println("even");}
										
										   else{ System.out.println("odd");}}
				  else{System.out.println("Zero");}
				  }
				     if(arr[0]==arr[arr.length -1]){  System.out.println("equal");}
					 		    else if(arr[0] >arr[arr.length -1]){  System.out.println("less than");}
else{ System.out.println("Grater than");}}}