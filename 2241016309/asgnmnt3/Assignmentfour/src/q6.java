/*Question-6
Write a java program to enter two numbers through the keyboard. Write a program to find the
value of one number raised to the power of another. (Do not use Java built-in method).
Sample run:
Enter the base: 5
Enter the power: 4
5 to the power 4 is: 625*/
import java.util.*;
public class q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the  base: ");
		int a=sc.nextInt();
		System.out.print("Enter the power: ");
		int b=sc.nextInt();
		int res=1;
		for (int i=1;i<=b;i++) {
			res*=a;	
		}
		System.out.println(a+" to the power " +b+ " is: "+res);

	}

}
