package takinInput;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Principle Amount");
		int principle = sc.nextInt();
		System.out.println("enter the rate");
		int rate= sc.nextInt();
		System.out.println("enter years");
		int years = sc.nextInt();
		int simpleInterest = principle*rate*years/100;
		System.out.println("Your Simple Interest is: "+ simpleInterest);
	}

}
