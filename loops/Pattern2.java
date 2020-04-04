package loops;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//       * * * * * 1 
//        * * * *  2
//          * * *  3
//            * *  4
//              *  5
System.out.println("How many rows");
int n=sc.nextInt();
for(int i=1;i<=n;i++) {
 for(int j=1;j<=i-1;j++) {      
	 System.out.print("  ");}    
 for(int j=1;j<=n-i+1;j++) {	   
	 System.out.print("* ");
 }
 System.out.println();
 }
	}

}

//        Neeed to find general formula for loops like
//        j<=n-1,j<=n-i+1)