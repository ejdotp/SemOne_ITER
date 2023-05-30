/*Amicable numbers are pair of numbers each of whose divisors are added to give the other number.
Example: The smallest pair of amicable numbers is (220, 284).
They are amicable because the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and
110, of which the sum is 284; and the proper divisors of 284 are 1, 2, 4, 71 and 142, of which
the sum is 220.
Note: 1 is included as a divisor but the numbers are not included as their own divisors.
Write a java program that tests whether a given pair of numbers is amicable numbers or not.
Sample run 1:
Enter first number: 220
Enter second number: 284
220 and 284 are amicable numbers.
Sample run 2:
Enter first number: 220
Enter second number: 230
220 and 230 are not amicable numbers.*/
package assignmentfive;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the first number: ");
		int x = sc.nextInt();
		System.out.print("Enter the second number: ");
		int y = sc.nextInt();
		int s1 = 0, s2 = 0;
		for (int i=1; i<x; i++) 
		{
			if (x%i==0)
			s1=s1+i;
			
		}
		for (int j=1;j<y;j++) 
		{
			if(y%j==0)
				s2=s2+j;
		}
		if (s1==y&&s2==x) {
			System.out.println(x+" and "+y+" are amicable numbers.");
		}
		else {
			System.out.println(x+" and "+y+" are not amicable numbers.");
		}
	}

}
