//Write a java program to create an array of size N and store the random values between 1 to N in it and find the sum and average.
import java.util.*;
class A7Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int N = sc.nextInt();
        int[]Grr = new int[N];
        int sum = 0;
        for(int i=0; i<N; i++)
        {
            int rad = (int)(Math.random()*N+1);
            Grr[i] = rad;
            sum += rad;
        }
        System.out.println("Sum of the array is: "+sum);
        System.out.println("Average is: "+(sum/N));
        sc.close();
    }
}
