/*Write a java program to exchange the values of two variables of integer type X and Y without
using third temporary variable. */
public class QuestionEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int y=3;
		y=x+y;
		x=y-x;
		y=y-x;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
