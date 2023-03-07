import java.util.Scanner;
public class QuestionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Basic Salary: ");
        double BS, DA, HRA, GS;
        BS=s.nextDouble();
        DA=BS*0.4;
        HRA=BS*0.2;
        GS=BS+DA+HRA;
        System.out.println("DA is: "+DA);
        System.out.println("HRA is: "+HRA);
        System.out.println("Gross Sallary is: "+(int)GS);

	}

}
