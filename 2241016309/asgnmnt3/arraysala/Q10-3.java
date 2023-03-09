import java.util.Scanner;
public class Q10 
{
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("a.Create an array of N integers \nb. Display the array elements \nc. Insert an element at specific position \nd. Delete an element at a given position \ne. Exit");
		System.out.println("Enter a choice: ");
		char ch= sc.next().charAt(0);
		
		int n=0;
		int[] array=null;
		switch(ch)
		{
		case 'a':
		{
			System.out.println("Enter size of integers: ");
			n = sc.nextInt();
			array= new int[n];
			System.out.println("Array Created.");
			break;
			
		}
		case 'b':
		{
			if(array==null)
			{
				System.out.println("Array not yet created.");
			}
			else
			{
				System.out.print("Array elements are: ");
				for(int i=0;i<n;i++)
				{
					System.out.print(array[i]+ " ");
				}
				System.out.println();
				break;
		     }
		}
			case 'c':
				if (array == null)
				{
                    System.out.println("Array is not yet created.");
                }
				else 
				{
                    System.out.print("Enter the position where you want to insert: ");
                    int p = sc.nextInt();
                    if (p < 1 || p > n + 1) 
                        System.out.println("Invalid position!");
                    else
                    {
                    	System.out.print("Enter the element to be inserted: ");
                        int elem = sc.nextInt();
                        for(int i=n-1;i>p-1;i--)
                        {
                        	array[i+1]=array[i];
                        }
                        array[p-1]=elem;
                        n++;
                        System.out.println("Element Inserted Successfully.");
                        break;
                    }
				}
                    case 'd':
                    {
                    	if(array == null)
                    	{
                    		System.out.println("Array not yet created.");
                    	    break;
                    	}
                    	else
                    	{
                    		System.out.println("Enter the position of element to be deleted.");
                    		int p= sc.nextInt();
                    		if(p<1 || p> n+1)
                    		{
                    			System.out.println("Invalid Position.");
                    	    }
                    		else
                    		{
                    			for(int i=p-1;i<n-1;i++)
                    			{
                    				array[i]=array[i+1];
                    			}
                    			n--;
                    			System.out.println("Element deleted successfully.");
                    		}
                    }
                    }
                    	break;
                    	case 'e':
                    	{
                    		System.out.println("Exiting.");
                    		System.exit(0);
                    		break;
                    	}
                    	default:
                    	{
                    		System.out.println("Invalid choice!");
                            break;
			
		}
		
	}
	

}
}
