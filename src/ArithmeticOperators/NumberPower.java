package ArithmeticOperators;

import java.util.Scanner;

public class NumberPower {
	public static void main(String[] args) {
		
		System.out.println("Enter the number = ");
		Scanner scan = new Scanner(System.in);
		double i= scan.nextDouble();
		
		double j = i*i;
		double k = i*i*i;
		double l = i*i*i*i;
		
		System.out.println("Square of " +i +" is " + j);
		System.out.println("Cube of " +i +" is " + k);
		System.out.println("Fourth power of " +i +" is " + l);
		
	}

}
