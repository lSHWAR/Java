package loops;
import java.util.Scanner;
public class AdvanedPattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("type in number of rows");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");}
			System.out.print(i);
			for(int j=1;j<=2*(i-1)-1;j++)
				System.out.print("0");
			if(i>1) {
			System.out.print(i);}
			System.out.println();
			
		}
	}

}
