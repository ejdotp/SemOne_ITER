/* Write a Java method to display the middle character of a string.*/
import java.util.*;
class HA6Q3 {
    public static char midly(String str)
    {
        int wah=str.length();
        if(wah%2==0)
        {
            return str.charAt((wah+1)/2);
        }
        else
        {
            return str.charAt(wah/2);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String wah = sc.nextLine();
        System.out.println("Middle character of the string \""+wah+"\" is: "+midly(wah));
        sc.close();
    }
}
