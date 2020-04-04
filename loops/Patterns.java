package loops;
import java.util.Scanner;


public class Patterns {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
   
//printPatters     * * * * *
//			       * * * * *
//			       * * * * *
//			       * * * * *
//			       * * * * *
		System.out.println("How many stars");
		int n=sc.nextInt();
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				System.out.print("* ");
			}
			System.out.println();
		}            
			
	}       
  }
		
		
	


