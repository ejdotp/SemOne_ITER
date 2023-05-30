/*Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. 
Write a java program that prompts the user to enter an integer and reports whether the integer is a palindrome. */
import java.util.Scanner;
public class A6Q3 
{
    public static int reverse(int n ) 
	{
		int sum=0;
		while(n!=0) {
			int rem = n%10;
			sum=sum*10+rem;
			n/=10;
		}
		return sum;
	}
	
    public static boolean isPalindrome(int n)
    {
        if(n==reverse(n)){
            return true;
        }
        else{
            return false;
        }
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
        int num = sc.nextInt();
        Boolean polly = isPalindrome(num);
        if(polly == true){
            System.out.println("It a palindrome babe ;)");
        }
        else{
            System.out.println("Nah man, palindrome no no");
        }
        sc.close();
	}
}
