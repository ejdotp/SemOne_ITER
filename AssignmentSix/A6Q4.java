import javax.lang.model.util.ElementScanner14;

/*Write a method that returns the number of days in a year using the following header:
public static int numberOfDaysInAYear(int year)
Write a java program that displays the number of days in year from 2000 to 2020. */
public class A6Q4 {
    public static int numberOfDaysInAYear(int year)
    {
        if(year%4==0 && year%100!=0)
        {
            return 366;
        }
        else if(year%400==0)
        {
            return 366;
        }
        else
        {
            return 365;
        }
    }
    public static void main(String[] args)
    {
        for(int i=2000; i<=2020; i++)
        {
            System.out.println("Number of days in the year "+i+" is "+(numberOfDaysInAYear(i)));
        }
    }
}
