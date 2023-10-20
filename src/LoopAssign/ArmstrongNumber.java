package LoopAssign;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Digits");
	int i = scan.nextInt();
	
	int j , sum=0 , k=i;
	
	while(i>0)
	{
		j= i%10;
		sum = sum + (j*j*j);
		i= i/10;
		
	}
	
	System.out.println("The value is  " + sum);
	if (k==sum)
	{
		System.out.println("It is a Armstrong number");
	
	}
	else
	{
		System.out.println("It is not Armstrong number");
	}
}
}
