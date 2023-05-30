/*password check kar */
import java.util.*;
class A6Q9 {
    public static boolean isValidPW(String pswd)
    {
        boolean valid=(pswd.length()>=8) && onlylettersanddigits(pswd) && atleastdigits(pswd);
        return valid;
    }
    public static boolean onlylettersanddigits(String pswd) 
    {
        for(int i=0; i<pswd.length();i++)
        {
            int a=(int)(pswd.charAt(i));
            if((a>=48 && a<=57) || (a>=65 && a<=90) || (a>=97 && a<=122))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean atleastdigits(String pswd) 
    {
        int count = 0;
        for (int i=0; i<pswd.length(); i++)
        {
            int a=(int)(pswd.charAt(i));
            if(a>=48 && a<=57)
            {
                count++;
            }
            if(count>=2)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String pswd=sc.nextLine();
        System.out.println((isValidPW(pswd)?"valid":"Invalid")+" Password.");
        sc.close();
    }
}
