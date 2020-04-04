package loops;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	System.out.println("Type your number");
	 int n=sc.nextInt();
       boolean isprime=true;
       for(int i=2;i<n;i++) {
    	   if(n%i==0) {
    		   isprime=false;
    		   break;
    	   }
    	   }
          if(n==1) {
    		   isprime=false;
    		  }
           	   System.out.println(n + " is Prime :" + isprime);


		 }
	 }

	
// (TIP: if a number has a factor then it will be in
//	range of 2 to underroot of that number )
//	(hence the range in above code is i*i<n)
//	THIS INCREASES YOUR COMPUTATION SPEED ,very helpful 
//	in interviews
               //		PRIME NUMBER FINISH!!
	


