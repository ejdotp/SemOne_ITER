/* Write a Java method to count all words in a string.*/
import java .util.*;
class HA6Q4 {
    public static int count(String gandhiya) 
    {
        String badhiya = gandhiya.trim();
        int chika = 1;
        for(int i=1; i<badhiya.length(); i++)
        {
            if((badhiya.charAt(i)==' ') && (badhiya.charAt(i+1)!=' '))
            {
                chika++;
            }
        }
        return chika;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String lol=sc.nextLine();
        System.out.println("Total no. of words are: "+count(lol));
        sc.close();
    }
}
