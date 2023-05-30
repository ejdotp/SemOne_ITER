/*Write a java program to calculate the area of triangle, square, circle, rectangle by using method overloading. */
class A6Q10 {
    public static void main(String[] args) 
    {
        System.out.println("Area of triangle is "+area(5, 10));
        System.out.println("Area of square is "+area(6.10));
        System.out.println("Area of circle is "+area(8));
        System.out.println("Area of rectangle is "+area(7.8, 8.5));
    }
    public static double area(int b, int h)
    {
        return (0.5*b*h);
    }
    public static double area(double s)
    {
        return (s*s);
    }
    public static double area(int r)
    {
        return (Math.PI*r*r);
    }
    public static double area(double p, double b)
    {
        return(p*b);
    }
}
