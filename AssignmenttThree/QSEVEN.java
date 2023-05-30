package assignmentthree;

import java.util.Scanner;

/*From the above question no. (6) write a java program with a choice if the consumer
wants to pay bill online. Consumer who pays their electricity bill online will get a
discount of 3%.
Here is the sample output:
No. of units consumed: 867
Do you want to pay online(y/n): y
Total amount: 4925.4
Discount: 147.762
Amount payable: 4777.638*/

public class QSEVEN {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of units consumed:");
		double a = sc.nextDouble();
		System.out.println("Do you want to pay online(y/n):");
		char b=sc.next().charAt(0);
		double bill, d;
		if(a<=50) {
			bill=(a*3);
		}
		else if(a<=200) {
			bill=((50*3)+((a-50)*4.8));
		}
		else if(a<=400) {
			bill=((50*3)+(150*4.8)+((a-200)*5.8));
		}
		else {
			bill=((50*3)+(150*4.8)+(200*5.8)+((a-400)*6.2));
		}
		System.out.println("Total amount: "+bill);
		if(b=='y') {
			d=(bill/100)*3;
			System.out.println("Discount: "+d);
		}
		else {
			d=0.0;
			System.out.println("No Discount");
		}
		System.out.println("Amount payable: "+(bill-d));
		

	}

}
