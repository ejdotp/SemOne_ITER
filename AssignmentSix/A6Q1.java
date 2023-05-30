/*Design a Simple Calculator using methods in java containing the following functionalities, namely, with 
Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The signature of the methods are given below.*/
import java.util.Scanner;
class A6Q1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter operation (+, -, *, /, %, sqrt): ");
        String op = sc.next();

        switch (op) 
        {
            case "+":
                System.out.println("Result: " + additionSimple(n1, n2));
                break;
            case "-":
                System.out.println("Result: " + subtractionSimple(n1, n2));
                break;
            case "*":
                System.out.println("Result: " + multiplicationSimple(n1, n2));
                break;
            case "/":
                System.out.println("Result: " + divisionSimple(n1, n2));
                break;
            case "%":
                System.out.println("Result: " + remainderSimple(n1, n2));
                break;
            case "sqrt":
                System.out.println("Result: " + squareRootSimple(n1));
                break;
            default:
                System.out.println("Invalid operation!");
        }
        sc.close();
    }

    public static int additionSimple(int x, int y) 
    {
        return x + y;
    }

    public static int subtractionSimple(int x, int y) 
    {
        return x - y;
    }

    public static int multiplicationSimple(int x, int y) 
    {
        return x * y;
    }

    public static int divisionSimple(int x, int y) 
    {
        if (y == 0) 
        {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return x / y;
    }

    public static int remainderSimple(int x, int y) 
    {
        return x % y;
    }

    public static double squareRootSimple(int x) 
    {
        if (x < 0) 
        {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(x);
    }
}
