package assignmentfive;
import java.util.*;
public class q9 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int n=sc.nextInt();
		double sum=0;
		for(int i=1; i<=n; i++)
		{
			sum+=1.0/(i*i);
		}
		System.out.printf("The sum of the series is: %.2f",sum);
	}
}
