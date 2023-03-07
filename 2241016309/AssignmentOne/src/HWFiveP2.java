/*
 * Write a java program to exchange the value of 4 variables W,G,K,A such that the value of
W will move to A, A to K, K to G and finally G to W. Exchange using with and without
using extra variables
 */
public class HWFiveP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int W = 1;
        int G = 2;
        int K = 3;
        int A = 4;
        
        // swapping W and G variables
        W = W + G;
        G = W - G;
        W = W - G;
 
        // swapping G and K variables
        G = G + K;
        K = G - K;
        G = G - K;
 
        // swapping K and A variables
        K = K + A;
        A = K - A;
        K = K - A;
        
        // printing results
        System.out.println("values after swapping are : ");
        System.out.println("W = " + W);
        System.out.println("G = " + G);
        System.out.println("K = " + K);
        System.out.println("A = " + A);

	}

}