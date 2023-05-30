/*
method 2:
import java.util.Scanner;
public class ProgramTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Distance in Kilometers: ");
double km;
km=s.nextDouble();
double m,f,inch,cm;
m=1000;
f=3280.8399;
inch=39370.0787;
cm=100000;
System.out.println(km+"km is "+km*m+"meters");
System.out.println(km+"km is "+km*f+"feet");
System.out.println(km+"km is "+km*inch+"inches");
System.out.println(km+"km is "+km*cm+"cm");

	}

}
*/
import java.util.Scanner;
public class ProgramTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Distance in Kilometers: ");
double km;
km=s.nextDouble();
double m,f,inch,cm;
m=km*1000;
f=km*3280.8399;
inch=km*39370.0787;
cm=km*100000;
System.out.println("Distance in Meters: "+m);
System.out.println("Distance in Feet: "+f);
System.out.println("Distance in Inches: "+inch);
System.out.println("Distance in Centimeters: "+cm);

	}

}
