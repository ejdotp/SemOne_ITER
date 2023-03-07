import java.util.Scanner;
public class try2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pw: ");
		int min=12;
		int max=64;
		String pass = sc.next();
		  if (pass.length()>min || pass.length()<max) {   
	            System.out.println("VALID!!");  


	}

}
