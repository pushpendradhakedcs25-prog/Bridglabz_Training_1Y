import java.util.Scanner;
   class heigth{
public static void main(String args[ ]){
                    Scanner sc = new Scanner(System.in);
					
					int []arr=new int[11];
					int sum=0;
					for(int i=0; i<arr.length; i++){
					   arr[i] = sc.nextInt();
					   sum+=arr[i];
					   }
					   double mean = (double)sum/arr.length ;
					   System.out.println(mean);}}