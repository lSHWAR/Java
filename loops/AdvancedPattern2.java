package loops;
import java.util.Scanner;

public class AdvancedPattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("type your number");
		int n=sc.nextInt();
//		for(int i=1;i<=n/2+1;i++) {
//			for(int j=1;j<=i;j++) {
//			System.out.print("* ");
//			}
//			System.out.println();
//			}
//		for(int j=1;j<=n/2;j++) {
//		for(int i=1;i<=n/2-j+1;i++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//		}               
//		               OR
		
		for(int i=1;i<=2*n-1;i++) {
			if(i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			}
			else {
					for(int j=1;j<=2*n-1-i+1;j++){
						System.out.print("* ");
					}
				}
				System.out.println();
				
				
			}
			
		}

		
   
	}


