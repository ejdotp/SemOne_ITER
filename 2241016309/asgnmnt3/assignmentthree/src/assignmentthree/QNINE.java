/*Write a program to input 3 integer number a, b, c. Find the largest number among 3.
Also find the 2nd largest number among 3. Here is the sample output:
Enter the value of a, b, c:10 30 50
Largest number: 50
2nd largest number: 30*/
package assignmentthree;

import java.util.Scanner;

public class QNINE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a, b, c:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && b>c){
			System.out.println("Largest number: "+a);
			System.out.println("2nd largest number: "+b);
		}
		else if(b>a && a>c){
			System.out.println("Largest number: "+b);
			System.out.println("2nd largest number: "+a);
		}
		else if(a>c && c>b){
			System.out.println("Largest number: "+a);
			System.out.println("2nd largest number: "+c);
		}
		else if(c>a && a>b){
			System.out.println("Largest number: "+c);
			System.out.println("2nd largest number: "+a);
		}
		else if(c>b && b>a){
			System.out.println("Largest number: "+c);
			System.out.println("2nd largest number: "+b);
		}
		else{
			System.out.println("Largest number: "+b);
			System.out.println("2nd largest number: "+c);
		}

	}

}
