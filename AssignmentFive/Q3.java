/*WAP to enter the first number and second number. Display the prime numbers between the
first and second number.
Sample run:
Enter the first number: 4
Enter the second number: 15
Prime numbers between 4 and 15 are: 5 7 11 13*/
package assignmentfive;
import java.util.*;
public class Q3 
{
	public static void main(String[] args) 
	{
		int  a, b, c;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter first number: ");
		a=sc.nextInt();
		int x=a;
		System.out.print("Enter second number: ");
        b=sc.nextInt();
        System.out.print("Prime numbers between "+a+" and "+b+"are: ");
        while(x<=b)
        {
        	c = 0;
        	for(int i=1;i<=x;i++) 
        	{
        		if(x%i==0) {
        			c++;  
        		}
        	}
        	if(c==2) {
        		System.out.print(x+" ");
        	}
        	x++;
        }
	}
}
