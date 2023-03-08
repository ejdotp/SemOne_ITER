//Write a java program to create an array of size N and store the random values between 1 to 100 in it and 
//print the number of prime numbers present in the array.
import java.util.*;
class A7Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int N = sc.nextInt();
        int[]Grr = new int[N];
        System.out.print("Enter elements of the array: ");
        int count = 0;
        for(int i=0; i<N; i++)
        {
            Grr[i] = sc.nextInt();
            if(prime(Grr[i]))
            count++;
        }
        
        System.out.println("No. of primes are: "+count);
        sc.close();
    }
    public static boolean prime(int x)
    {
        for(int i = 2; i<=Math.sqrt(x); i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
}