package loops;
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		
//		 Q) draw the pattern * * * * *
//                             * * * *
//                               * * *
//                                 * *
//                                   *
System.out.println("Number of rows : ");  
int n=sc.nextInt();
for(int i=1;i<n+1;i++){
for(int j=1;j<=n-i+1;j++) {
System.out.print("* ");
}
System.out.println();
}      

	}

}
