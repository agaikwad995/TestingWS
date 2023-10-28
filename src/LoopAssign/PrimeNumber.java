package LoopAssign;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number");
	int number = scan.nextInt();
	int i , j = 0; 
	
	for (i = 2; i <= number/2; i++ ) {
		if (number%i==0)
		{
			j++;
		}
	}
	
	if (j == 0 && number!= 1) {
		System.out.println("Prime number");
		}
	else
		{
		System.out.println("Not a prime number");
		}

	}
}
