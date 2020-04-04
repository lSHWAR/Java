package loops;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("type your number");		
		int n=sc.nextInt();
		int factorial=1;
		for(int i=n;i>0;i--){
			factorial=factorial*i;
			}
		System.out.println("Factorial of Number is: "+ factorial);
	}

}
