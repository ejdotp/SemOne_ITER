/*A pentagonal number is defined as n (3n–1)/2 for n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
Write a java program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line. */
import java.util.*;
public class A6Q2 
{
    public static int getPentagonal(int n) 
    {
		int pent = n*(3*n-1)/2;
		return pent;
	}

	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();

		for(int i =1;i<=n;i++) 
        {
		    System.out.print(getPentagonal(i)+" ");
		}
        sc.close();
	}

}
