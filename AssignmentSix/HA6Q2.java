/*Write a java program to calculate the volume of sphere, cuboid and cube by using method overloading. */
class HA6Q2 
{
    public static void main(String[] args) 
    {
        System.out.printf("Volume of Sphere is %.3f",Volume(10));
        System.out.printf("\nVolume of Cuboid is %.3f",Volume(6.10, 7.1, 2.3));
        System.out.printf("\nVolume of Cube is %.3f",Volume(8.5));
    }
    public static double Volume(double s)
    {
        return (s*s*s);
    }
    public static double Volume(int r)
    {
        return ((4.0/3.0)*Math.PI*r*r*r);
    }
    public static double Volume(double p, double b, double h)
    {
        return(p*b*h);
    }
}
