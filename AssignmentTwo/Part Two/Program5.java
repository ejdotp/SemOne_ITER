//Write a java program that takes three int values from the command line and prints them in ascending order. Use Math.min() and Math.max().
public class Program5
{
public static void main(String[] args)
{
int a,b,c,x,min,z,max,mid;
a = Integer.parseInt( args[0] );
b = Integer.parseInt( args[1] );
c = Integer.parseInt( args[2] );
x = Math.min(a, b);
min = Math.min(x,c);
z = Math.max(a, b);
max = Math.max(z, c);
mid = a+ b+ c- min - max;
System.out.println(min);
System.out.println(mid);
System.out.println(max);
}
}
