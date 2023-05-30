/*Write a java program to take an integer input from the user and print the input by removing all
zeros.
Example: Input = 10200 then Output = 12.
Sample run:
Enter an integer number: 10203040
After removing 0 from number 10203040, the new number is 1234.*/
import java.util.*;
public class q9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int num = sc.nextInt();
		int i = 0;
		int nua = 0;
		int n = num;
		while(n!=0) {
			int d = n%10;
			if(d!=0) {
				nua+=(int)(d*Math.pow(10, i));
				i++;
			}
			n/=10;
		}
		System.out.println("After removing 0 from number "+num+", the new number is "+nua+".");

	}

}
