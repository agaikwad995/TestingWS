import java.util.Scanner;

public class PositiveNegativeAssign {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
	    int i = scan.nextInt();
	    
	    if(i>=0)
	    {
	    	System.out.println("Numbe is Positive");
	    	
	    }
	    else
	    {
	    	System.out.println("Number is Negative");
	    }

	}
	
}
