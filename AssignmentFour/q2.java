/*An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your
program to determine whether or not the number is divisible by 9. Test it on the following
numbers: Use while loop.
n = 123456
n = 154368
n = 621594
Hint: Use the % operator to get each digit; then use / operator to remove the digit.*/
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		int sum = 0;
		int l = 1;
		while(n!=0) {
			l=n%10;
			sum+=l;
			n=n/10;
		}
		if(sum%9==0) {
			System.out.println("Yes, it's divisible by 9");
		}
		else {
			System.out.println("No, it's not divisible by 9");
		}

	}

}
