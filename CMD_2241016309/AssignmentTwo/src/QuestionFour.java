import java.util.Scanner;
public class QuestionFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an Integer between 1 & 1000: ");
        long x, y, z, p;
        x=s.nextLong();
        y=x%10;
        z=(x/10)%10;
        p=(x/100)%10;
        System.out.println("The sum of digits is: "+(y+z+p));

	}

}
