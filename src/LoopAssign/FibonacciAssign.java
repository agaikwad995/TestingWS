package LoopAssign;

import java.util.Scanner;

public class FibonacciAssign {

	public static void main(String[] args) {
		System.out.println("How many number you want in the sequence - ");
		Scanner scan= new Scanner(System.in);
		int i = scan.nextInt();
		
		int a=1, b=1;
		
		int j=1;
		while(j<i) {
			
			System.out.print(a + " ");
			int l = a + b;
			a = b;
			b = l;
			j++;
		}
	}

}
