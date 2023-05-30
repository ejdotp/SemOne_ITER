/*Write a Java method that accept three integers and check whether they are consecutive are not. Return true or false. */
import java.util.*;
class HA6Q5 {
    public static boolean consecutive(int x, int y, int z)
    {
        if((x+1==y && y+1==z) || (z+1==y && y+1==x))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st no: ");
        int a = sc.nextInt();
        System.out.print("Input 2nd no: ");
        int b = sc.nextInt();
        System.out.print("Input 3rd no: ");
        int c = sc.nextInt();
        System.out.println("Check whether the three said numbers are consecutive or not! \n"+consecutive(a, b, c));
        sc.close();
    }
}
