/*Write a java program in which using one for loop and one if statement, prints the integers
from 1,000 to 2,000 with five integers per line. Hint: Use the % operation.*/
class hq3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i <= 2000; i++) {
            System.out.print(i + " ");
            if ((i - 999) % 5 == 0) {
                System.out.println();
            }
        }
    }
}
