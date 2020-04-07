package loops;
import java.util.Scanner;
public class AdvancedPattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("type number of rows");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				}int num=n-i+1;
			for(int j=2;j<=i;j++) {
				
				System.out.print(num);
				num+=1;}
			System.out.print("0");
			int num2=n-1;
			for(int j=2;j<=i;j++) {
				
				System.out.print(num2);
				num2-=1;
			}
			System.out.println();
		}

	}

}
