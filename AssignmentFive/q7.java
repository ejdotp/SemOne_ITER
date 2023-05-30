package assignmentfive;

public class q7 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			int a=65;
			for(int j=1; j<=i; j++) {
				System.out.print((char)a+" ");
				a++;
			}
			System.out.println();
		}
		System.out.println();
		for(int i=5; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i+1; j--) {
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
