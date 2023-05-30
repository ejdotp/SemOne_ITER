import java.util.Scanner;

/*Write a java program that takes an integer N from user, uses
Math. Random () to print N random integer numbers between 1 to N, and then prints their
average value. Use do while loop.
Sample run:
Enter a number: 6
Random numbers generated are: 6 4 5 2 2 5
Average of 6 random numbers are 4*/
import java.util.*;
public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		int s=0;
		int i=0;
		System.out.print("Random numbers generated are: ");
		do {
			int rand=(int)(Math.random()*N+1);
			System.out.print(rand+" ");
			s+=rand;
			i++;
		}while(i<N);
		System.out.println("\nAverage of "+N+" random numbers are "+(s/N));
		

	}

}
