package AlgotithmPractice;

import java.util.Scanner;

public class MoneyReturn {
	
	public static int[] change(int amount, int[] coins){
		int[] change1 = new int[coins.length];
		for (int i = coins.length - 1; i >= 0; i--) {
		while(amount >= coins[i]) {
			change1[i]++;
			amount -= coins[i];
			
		}
	}
	return change1;
	}

public static void main(String[] args) {
	
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter amount of the product : ");
	int productamount = scan.nextInt();
	System.out.println("Enter amount recieved from customer :");
	int recievedamount = scan.nextInt();
	
	int amount = recievedamount - productamount; 
	
	System.out.println("Change to be given to the customer :" + amount);
	
	int[] coins = {1 , 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000};
	int[] change1 = change(amount, coins);
	for (int i = 0; i < change1.length; i++) {
        if (change1[i] > 0) {
            System.out.println(coins[i] + " ₹" + " * " + change1[i]);
        }
	}
	
	
}

}
