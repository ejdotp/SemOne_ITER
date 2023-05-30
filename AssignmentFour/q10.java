/*Write a java program to print largest power of three less than or equal to N.
Sample run:
Enter a number: 100
The largest power of 3 less than or equal to 100 is 81*/
import java.util.*;
public class q10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		int x = 1;
		int y = 1;
		while(x<=N) {
			y = x;
			x = x*3;
		}
		System.out.println("The largest power of 3 less than or equal to "+N+" is "+y);


	}

}
