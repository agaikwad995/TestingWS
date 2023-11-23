package LoopAssign;

import java.util.Scanner;

public class FirstTwentyPrimeNumber {
	public static void main(String[] args) {
		
		int i,j,k, n=0;
		 
		
		for (i = 2; n <= 20 ; i++) {
			k=0;
			for (j=2;j<i;j++)
			{
				if(i%j==0)
				{
				k++;
				break;
				}
			}
				if(k==0)
				{
					System.out.print(i +" ");
					n++;
					
				}
				
			}
		}
}
