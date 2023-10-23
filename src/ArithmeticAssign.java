import java.util.Scanner;

public class ArithmeticAssign {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
        int i = scan.nextInt();
        System.out.println("Enter the second integer: ");
        int j = scan.nextInt();
        
        int sum = i + j;
        int difference = i - j;
        int product = i * j;
        double average = (double) (i + j) / 2;
        int distance = Math.abs(i - j);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        
        if (i> j)
        {
        System.out.println("Maximum: " + i);
        }
        else{
        	System.out.println("Maximum: " + j );
        }
       if(j>i)
        {
        	System.out.println("Minimum: " + i);
        }
        else
        {
        	System.out.println("Minimum: " + j);	
        }
	}

}
