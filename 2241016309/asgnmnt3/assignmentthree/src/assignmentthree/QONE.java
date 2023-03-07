/*Write a program to input the age of a person and check if the age of the person is
greater than or equal to 18 then print the message:
“You are eligible to cast your vote”.*/
package assignmentthree;
import java.util.Scanner;
public class QONE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age:");
		int age = sc.nextInt();
		if(age>=18){
			System.out.println("Yay! you are eligible.");
		}
		else {
			System.out.println("Sorry, you aint eligible.");
		}
	}

}
