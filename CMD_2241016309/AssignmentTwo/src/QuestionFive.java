import java.util.Scanner;
import java.lang.Math;
public class QuestionFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter radius of the hemisphere: ");
        double r, SA, VA;
        r=s.nextDouble();
        SA=3*Math.PI*Math.pow(r, 2);
        VA=(2/3.0)*Math.PI*Math.pow(r, 3);
        System.out.printf("Surface Area of the hemispher is: %.3f",SA);
        System.out.printf("\nVolume Area of the hemispher is: %.3f",VA);
        
	}

}
