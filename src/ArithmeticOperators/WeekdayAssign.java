package ArithmeticOperators;
import java.util.Scanner;

public class WeekdayAssign {
	public static void main(String[] args){
		System.out.println("Enter a integer value from 1 to 7 : ");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		if (i == 1) 
		{
			System.out.println("1 - Sunday");
		}

		else if (i == 2) 
		{
			System.out.println("2 - Monday");
		}
		else if (i == 3) 
		{
			System.out.println("3 - Tuesday");
			
		}
		else if (i == 4) 
		{
			System.out.println("4 - Wednesday");
			
		}
		else if (i == 5) 
		{
			System.out.println("5 - Thursday");
			
		}
		else if (i == 6) 
		{
			System.out.println("6 - Friday" );
	
		}
		else if (i == 7) 
		{
		
			System.out.println("7 - Saturday");
		}
		else 
		{
			System.out.println("Please enter the integer value from 1 to 7");
		}
	}

}
