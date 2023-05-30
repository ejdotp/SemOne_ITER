/*Write a java program to print the following output using loop. Where, input is the number of
rows in output pattern.
For input, N = 4.
1
121
1213121
121312141213121*/

import java.util.*;
class hq5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int N =sc.nextInt();
        String a =" 1 ";
        for (int i = 2; i <=N+1; i++) {
            System.out.println(a);
            a=a+i+a;
            
        }
        sc.close();
    }
}
