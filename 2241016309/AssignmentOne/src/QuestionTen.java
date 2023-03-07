/*
Assume a string variable ruler1 contains “1” initially i.e. String ruler1=”1” Write a java
program to print the following output using string concatenation. (You can take extra string
variables)
1
1 2 1
1 2 1 3 1 2 1
1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
*/
public class QuestionTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ruler1="1 ";
        String r2="2 ";
        String r3="3 ";
        String r4="4 ";
        System.out.println(ruler1);
        System.out.println(ruler1+r2+ruler1);
        System.out.println(ruler1+r2+ruler1+r3+ruler1+r2+ruler1);
        System.out.println(ruler1+r2+ruler1+r3+ruler1+r2+ruler1+r4+ruler1+r2+ruler1+r3+ruler1+r2+ruler1);
	}

}
//or this method: (ruler1+"2 "+ruler1)