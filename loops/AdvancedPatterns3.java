package loops;
import java.util.Scanner;

public class AdvancedPatterns3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
			int n=sc.nextInt();
	 System.out.println("*");
	 for(int i=2;i<=n-1;i++) {
		 System.out.print("* ");
	for(int j=1;j<=i-2;j++) {
		System.out.print("  ");
		 }
		 System.out.print("* ");
	     System.out.println();
	 }
	 for(int j=1;j<=n;j++) {
		 System.out.print("* ");}
	}
}


