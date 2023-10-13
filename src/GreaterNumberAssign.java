import java.util.Scanner;

public class GreaterNumberAssign {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st number : ");
		int i = scan.nextInt();
		System.out.println("Enter 1st number : ");
		int j = scan.nextInt();
		System.out.println("Enter 1st number : ");
		int k = scan.nextInt();
		
		if(i > j && i > k)
		{
			System.out.println("The greater number is " + i);
		}
		else if(j>i && j>k)
		{
			System.out.println("The greater number is " + j);
		}
		else
		{
			System.out.println("The greater number is " + k);
		}
		
	}

}
