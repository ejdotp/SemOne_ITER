//Write a java program that takes two int values from the command line as dividend and divisor and print the quotient and remainder.
public class Program1
{
public static void main(String[] args)
{
int dividend, divisor, quotient, remainder;
dividend=Integer.parseInt(args[0]);
divisor=Integer.parseInt(args[1]);
remainder=dividend%divisor;
System.out.println("remainder is "+remainder);
quotient=dividend/divisor;
System.out.println("quotient is "+quotient);

}
}
