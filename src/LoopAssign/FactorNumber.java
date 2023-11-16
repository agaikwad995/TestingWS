package LoopAssign;

import java.util.Scanner;

public class FactorNumber {
public static void main(String[] arge) {
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the number :  ");
	int n = scan.nextInt();
	
	for (int i=1; i <= n; i++)
	{
		if(n % i == 0) {
			System.out.print(i + " ");
		}
	}
}
}
