/*
Question-5:
Write a java program to exchange the value of 4 variables W,G,K,A such that the value of
W will move to A, A to K, K to G and finally G to W. Exchange using with and without
using extra variables
 */
public class HWFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=1;
		int G=2;
		int K=3;
		int A=4;
		int M=W;
		W=G;
		G=K;
		K=A;
		A=M;
		System.out.println(W);
		System.out.println(G);
		System.out.println(K);
		System.out.println(A);
	}

}
