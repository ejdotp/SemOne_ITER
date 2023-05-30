/*Write a program to find the first non-repeated character in a given String, for example, if the given String is "Java" 
then the first non-repeated character is "J". */
import java.util.*;
class HA6Q1 {
    public static int repeat(String stir) 
    {
        for(int i=0; i<stir.length(); i++)
        {
            boolean istr=true;
            for(int j=0; j<stir.length(); j++)
            {
                if(i!=j && stir.charAt(i)==stir.charAt(j))
                {
                    istr=false;
                    break;
                }
            }
            if(istr)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str1=sc.nextLine();
        int c=repeat(str1);
        if(c!=-1)
        System.out.println("The first non repeasted character in string is: "+str1.charAt(c));
        else
        System.out.println("No non-repeated characters");
        sc.close();
    }
}
