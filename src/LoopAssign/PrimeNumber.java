package LoopAssign;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number");
	int number = scan.nextInt();
	int i; 
	boolean flag = false;
	for (i = 2; i <= number/2; i++ ) {
		if (number%i==0)
		{
			flag = true;
			break;
		}
	}
	
	if (!flag) {
		System.out.println("Prime number");
		}
	else
		{
		System.out.println("Not a prime number");
		}

	}
}
