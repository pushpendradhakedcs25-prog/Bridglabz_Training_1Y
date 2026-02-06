import java.util.*;
class Demension{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ROW  for 2D matrix ");
		int row= sc.nextInt();
			System.out.println("Enter COLOUM for 2D matrix ");
		int col= sc.nextInt();
		int num=row*col;
		int [][]arry = new int [row][col];
		int []arr=new int [num];
		System.out.println("Enter 2D array Element");
		   for(int i=0; i<row; i++){
			   for(int j=0; j<col; j++){
		   arry[i][j]=sc.nextInt();}}
		   		System.out.println("Print 2D array");
		                                                   	   for(int i=0; i<row; i++){
			                                                              for(int j=0; j<col; j++){
		                                                                              System.out.print(arry[i][j]+" ");}
																					                         System.out.println();  }
		   
		   int index=0;
		   System.out.println("2D to 1D array convert");
		   for(int i=0 ; i<row; i++){
			   for(int j=0; j<col; j++){
			   arr[index]=arry[i][j];
		   index++;}}
		      for(int i=0 ; i<num; i++){
System.out.print(arr[i]+" ");}}}
			   
			   