//Write a java program to input a character from command line and display the ASCII value of the entered character.
public class Program6{
	public static void main(String[] args){
		// char a=args[0].charAt(0);
		// System.out.println((int)a);
		int min=1; 
		int max=6; 
		int n1=(int)(Math.random()*(max-min+1)); 
		int n2=(int)(Math.random()*(max-min+1)); 
		System.out.println(n1+n2); 
	} 
}