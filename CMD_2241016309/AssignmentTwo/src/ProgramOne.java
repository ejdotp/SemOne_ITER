import java.util.Scanner;
public class ProgramOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Temprature in Degree Fahrenheit: ");
		double fahrenheit;
		fahrenheit=s.nextDouble();
		double Celsius;
		Celsius=(fahrenheit-32)*(5.0/9.0);
		System.out.println("Temprature in Degree Celsius: "+Celsius);

	}

}
