package LoopAssign;

public class DivisibleNumbers {
public static void main(String[] args) {
	System.out.println("First 100 numbers divisible by 3 : ");
	int i;
	for (i=1; i<=100; i++) {
		if (i%3 == 0) {
			System.out.print(i + " ");
		}
	}
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("First 100 numbers divisible by 5 : ");
	int j;
	for (j=1; j<=100; j++) {
		if (j%5 == 0) {
			System.out.print(j + " ");
		}
	}
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("First 100 numbers divisible by 3 and 5 : ");
	int k;
	for (k=1; k<=100; k++) {
		if (k%3 == 0 && k%5==0) {
			System.out.print(k + " ");
		}
	}
	
		
	}
}
