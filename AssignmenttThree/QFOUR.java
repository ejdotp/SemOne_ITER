package assignmentthree;

import java.util.Scanner;

/*Make a simple game involving a computer and a user. The computer first guesses a
number between 1 and 9 inclusive, then ask the user to enter a number between 1 and
9 inclusive. If the user guess is correct then display “You got it right”, if the guess is
close (+1, -1) “Almost got it “, Otherwise “You got it wrong”.*/

public class QFOUR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user number:");
		int guessy = sc.nextInt();
		int nummy = (int)(Math.random()*9+1);
		System.out.println("Computer guesses: "+nummy);
		if(guessy == nummy){
			System.out.println("You got it right ;)");
		}
		else if(nummy==guessy+1 || nummy==guessy-1){
			System.out.println("Almost got it :)");
		}
		else {
			System.out.println("You got it wrong :(");
		}
		
	}

}
