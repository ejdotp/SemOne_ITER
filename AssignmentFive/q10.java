package assignmentfive;
import java.util.*;
public class q10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int n=sc.nextInt();
		int sum=0, a=0, b=1, c=1;
		System.out.println("The sequence is: ");
		System.out.print("0 1 1 ");
		//                a b c
		for (int i=4; i<=n; i++) {
			int d=a+b+c;
			a=b;
			b=c;
			c=d;
			System.out.print(d+" ");
		}
	}

}
