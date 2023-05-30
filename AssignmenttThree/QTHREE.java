package assignmentthree;

import java.util.Scanner;

/*Write a program that reads three integers from the user and prints "Increasing" if the
numbers are in increasing order, "Decreasing" if the numbers are in decreasing order,
and "Neither increasing nor decreasing order" otherwise.*/

public class QTHREE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number:");
		int N1 = sc.nextInt();
		System.out.println("Input second number:");
		int N2 = sc.nextInt();
		System.out.println("Input third number:");
		int N3 = sc.nextInt();
		if(N1<N2 && N2<N3){
			System.out.println("Increasing");
		}
		else if(N1>N2 && N2>N3){
			System.out.println("Decreasing");
		}
		else {
			System.out.println("Neither increasing nor decreasing order");
		}

	}

}
