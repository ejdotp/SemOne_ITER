import java.util.Scanner;
public class QuestionSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        double t, d, g;
        t=s.nextDouble();
        g=32.174;
        d=(1/2.0)*g*t*t;
        System.out.printf("Distance Travelled = %.3f",d);
        
	}

}
