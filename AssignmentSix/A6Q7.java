/*Write java method called count accepts a string as input and returns the number of vowels in it. The method header is given below.
public static int count(String str)
For example, count ("Welcome") returns 2. */
import java.util.*;
public class A6Q7 
{
    public static int count(String str)
    {
        int fr=0;                                                      //to check freq
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                fr++;
            }
        }
        return fr;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String omg=sc.nextLine();
        System.out.println("Amount of vowels is "+(count(omg)));
        sc.close();
    }
}
