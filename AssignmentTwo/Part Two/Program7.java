/*Write a java program that takes three positive integers from command-line arguments and
prints true if any one of them is less than or equal to the product of the other two and false
otherwise.*/
public class Program7 {

	public static void main(String[] args) {
		int a,b,c;
		a = 2;
        b = 1;
        c = 4;
        boolean ans = (a<=(b*c) || b<=(c*a) || c<=(a*b));
        System.out.println(ans);

	}

}
