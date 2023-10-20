package LoopAssign;

import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Digits");
	int i = scan.nextInt();
	
	int j , sum=0;
	
	while(i!=0)
	{
		j= i%10;
		sum = sum*10 + j;
		i= i/10;
		
	}
	System.out.println("Sum of digits is " + sum);
	
}

}
