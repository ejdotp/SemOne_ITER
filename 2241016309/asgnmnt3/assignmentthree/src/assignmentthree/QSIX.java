package assignmentthree;

import java.util.Scanner;

/*Write a java program to calculate the monthly electricity bill. The tariff is given as
follows:

Price per unit Unit range
Rs. 3/- First 50 units
Rs. 4.80/- 50-200 units
Rs. 5.80/- 200-400 units
Rs. 6.20/- Above 400 units*/

public class QSIX {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input total units:");
		double a = sc.nextDouble();
		double c;
		if(a<=50) {
			c=(a*3);
		}
		else if(a<=200) {
			c=((50*3)+((a-50)*4.8));
		}
		else if(a<=400) {
			c=((50*3)+(150*4.8)+((a-200)*5.8));
		}
		else {
			c=((50*3)+(150*4.8)+(200*5.8)+((a-400)*6.2));
		}
		System.out.println("Total amount: "+c);

	}

}
