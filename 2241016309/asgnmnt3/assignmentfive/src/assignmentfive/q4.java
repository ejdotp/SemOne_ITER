/*WAP to calculate and display the factorial of all numbers between m and n (where m < n, m
> 0, n > 0)
Sample run:
Enter the value of m: 2
Enter the value of n: 5
Factorial of 2 is: 2
Factorial of 3 is: 6
Factorial of 4 is: 24
Factorial of 5 is: 120*/
package assignmentfive;
import java.util.*;
public class q4 {

	public static void main(String[] args) {
		int m, n, f = 1;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the value of m: ");
		m=sc.nextInt();
		System.out.print("Enter the value of n: ");
		n=sc.nextInt();
		while(m<=n) {
			for (int i=1;i<=m;i++) {
				f*=i;
			}
			System.out.println("Factorial of "+m+" is: "+f);
			f = 1;
			m++;
		}

	}

}
