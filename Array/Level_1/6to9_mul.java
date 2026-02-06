import java.util.Scanner;
class mul{
public static void main (String args[ ]){
Scanner sc = new Scanner(System.in);
                                System.out.println("Entre number ");
                            int a=sc.nextInt();
							int mul;
							int [ ] arr = new int [10];
							while(a<=6||a>=9){
							System.out.println("please entre number between 6 to 9");
						        a=sc.nextInt();	}
								System.out.println("multiplicatioon table");
				    for(int i=0;  i<arr.length; i++){
                                  mul= a*(i+1);
								  System.out.println(mul);
}}}
											