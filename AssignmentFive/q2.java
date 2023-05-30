/*WAP to check whether a number is twisted prime or not. Twisted prime is a number if the
number and its reverse both are prime then it is called twisted prime.
Sample run 1:
Enter a number: 97
97 is twisted prime.
Sample run 2: 43
43 is not a twisted prime*/
package assignmentfive;
import java.util.*;
public class q2 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter a number: ");
		int p=sc.nextInt();
		int temp=p;
		int revnum=0;
		while(temp!=0) 
		{
			revnum=revnum*10+temp%10;
			temp=temp/10;	
		}
		int c1=0;
		for (int i=1;i<=p;i++) 
		{
			if (p%i==0)
				c1++;
		}
		int c2=0;
		for (int j=1;j<=revnum;j++) 
		{
			if(revnum%j==0)
				c2++;
		}
		if(c1==2&&c2==2) 
		{
			System.out.println(p+" is a twisted Prime.");
		}
		else {
			System.out.println(p+" is not a twisted Prime.");
		}
		sc.close();
	}
}
