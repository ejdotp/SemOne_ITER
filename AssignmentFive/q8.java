package assignmentfive;
import java.util.*;
public class q8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int n=sc.nextInt();
		int ans=0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				ans+=j;
			}
		}
		System.out.println("The sum of 1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n) is: "+ans);
		sc.close();
	}

}
