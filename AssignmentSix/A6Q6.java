import java.util.Scanner;

/*Write a java program that prompts the user to enter a string followed by a character and displays the number of occurrences of the character in the string.*/
public class A6Q6 
{
    public static int count(String str, char a)
    {
        int fr=0;                                                      //to check freq
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==a){
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
        System.out.print("Enter char to check freq: ");
        char c=sc.next().charAt(0);
        System.out.println("Frequncy is "+(count(omg, c)));
        sc.close();
    }
}
