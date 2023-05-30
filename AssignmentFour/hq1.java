/*Write a java program to find the difference between the sum of the squares of the first ten
natural numbers and the square of the sum.

The sum of the squares of the first ten natural numbers is:
1
2 + 22 + 32 + 42 + 52 + 62 + 72 + 82 + 92 + 102 = 385

The square of the sum of the first ten natural numbers is:
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first
ten natural numbers and the square of the sum is 3025 − 385 =
2640.*/
public class hq1 {
    public static void main(String[] args) {
        int s1=0, s2=0;
        for(int i=1; i<=10; i++){
            s1+=i;
        }
        for(int j=1; j<=10; j++){
            int sqr=j*j;
            s2+=sqr;
        }
        System.out.println("The difference is: "+((s1*s1)-s2));
    }
}
