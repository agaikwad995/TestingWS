import java.util.Scanner;

public class ArithmeticAssign {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
		double i = scan.nextDouble();
        System.out.println("Enter the second integer: ");
        double j = scan.nextDouble();
        
        double sum = i + j;
        double difference = i - j;
        double product = i * j;
        double average = (double) (i + j) / 2;
        double distance = Math.abs(i - j);
        
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
