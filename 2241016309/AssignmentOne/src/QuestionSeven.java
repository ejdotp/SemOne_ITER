/* Write a java program to exchange the values of two variables of integer type X and Y using
third temporary variable Z */
public class QuestionSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12345;
		int y=67891;
		int z=x;
		x=y;
		y=z;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
