package loops;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type your number");
		int n = sc.nextInt();
		int a=0,b=1,c=0 ;
		System.out.print(a+ " ");
//		System.out.print(b+ " ");
		for(int i=0;i<n-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
	        }
	}

}
// result wanted : 0 1 1 2 3 5 8 13 21 ...of n terms
//0 0 0=0    0
//0 0 1=1    1
//2    =1    2
//     =2    3
//