//Write a java method to check a string is palindrome or not in java?
import java.util.Scanner;
class A6Q8 
{
    public static boolean isPalindrome(String word)
    {
        int left=0, right = word.length() - 1;
        while (left<right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
        String sutur = sc.nextLine();
        System.out.println(sutur+(isPalindrome(sutur)?" is":" is not")+" a palindrome string");
        // Boolean polly = isPalindrome(sutur);
        // if(polly == true)
        // {
        //     System.out.println("It a palindrome babe ;)");
        // }
        // else{
        //     System.out.println("Nah man, palindrome no no");
        // }
        sc.close();
    }
}
