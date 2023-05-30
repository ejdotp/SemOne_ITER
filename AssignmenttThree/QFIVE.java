package assignmentthree;

import java.util.Scanner;

/*Write a Java program that takes a year from user and print true if that year is a leap year
otherwise print false.*/

public class QFIVE {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the year:");
		int yr = sc.nextInt();
		if(yr%4==0 && yr%100 !=0){
			System.out.println(yr+" is a leap year: true");
		}
		else if(yr%400==0){
			System.out.println(yr+" is a leap year: true");
		}
		else {
			System.out.println(yr+" is a leap year: false");
		}

	}

}
