package assignmentfive;

import java.util.Scanner;

class hq5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms in the Fibonacci sequence: ");
    int n = sc.nextInt();
    
    int a = 0, b = 1, c;
    System.out.print("Fibonacci Series is: " + a + ", " + b);
    
    for (int i = 2; i < n; i++) {
      c = a + b;
      System.out.print(", " + c);
      a = b;
      b = c;
    }
    sc.close();
  }
}

