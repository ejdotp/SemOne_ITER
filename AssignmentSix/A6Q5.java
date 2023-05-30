/*A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same 
degree (i.e., the polygon is both equilateral and equiangular). The formula for computing the area of a regular polygon is
Write a method that returns the area of a regular polygon using the following header: */
import java.util.Scanner;
public class A6Q5 {
    public static double area(int n, double side)
    {
        double ar = ((n*side*side)/(4*Math.tan(Math.PI/n)));
        return ar;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sides: ");
        int n = sc.nextInt();
        System.out.print("Enter length of each side in cm: ");
        double S = sc.nextDouble();
        System.out.printf("\nArea of the regular polygon is: %.3f",(area(n, S))+"cm.square");
        sc.close();
    }
}
