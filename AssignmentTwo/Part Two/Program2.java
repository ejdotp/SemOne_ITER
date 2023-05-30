//Write a java program that takes two positive integers from command-line arguments and prints the result of first number raise to the power of second number.
public class Program2
{
public static void main(String[] args)
{
double a,b,c;
a=Double.parseDouble(args[0]);
b=Double.parseDouble(args[1]);
c=Math.pow(a, b);
System.out.println("answer is "+c);

}
}

