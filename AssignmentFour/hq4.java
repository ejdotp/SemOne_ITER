/*Write a java program to print the sum of all even numbers and the product of all odd numbers
from 1 to N. Where, N is the input to the program.
For input, N = 10
Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30
Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945*/
import java.util.*;
class hq4 {
    public static void main(String[] args) {
        int odd=1, even=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2==0){
                even+=i;
            }
            else{
                odd*=i;
            }
        }
        System.out.println((even)+" "+(odd));
        sc.close();
    }
}
