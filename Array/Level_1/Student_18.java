import java.util.*;
class array{
    public static void main (String args[ ] ){
	   Scanner sc = new Scanner(System.in);
	   int [ ] arr = new int[10];
	   for(int  i=0; i<arr.length; i++){
	   arr[i]=sc.nextInt();
	   if(arr[i]>=18){
		   System.out.println("Student can vote with age  "+arr[i]);
	   }
	   else{ System.out.println("Student can't  vote with age "+arr[i]);}
	   }
}}
	   