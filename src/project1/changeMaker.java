package project1;

import java.util.Scanner;

public class changeMaker {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount less then 99 Cent and display the breakdown change: ");
		int amount = input.nextInt();
		
		getChange(amount);
		input.close();
	}

	private static void getChange(int amount) {
		int quarter, dime, nickel, penny, balance;
		
		quarter = amount / 25;
		balance = amount % 25;
		
		dime = balance / 10;
		balance = balance % 10;
		
		nickel = balance / 5;
		balance = balance % 5;
		
		penny = balance / 1;
		balance = balance % 1;
		
		System.out.println("The change are: ");
		System.out.println("Number of Quarters: " + quarter + 
							"\nNumber of Dime: " + dime + 
							"\nNumber of Nickel: " + nickel +
							"\nNumber of Peny: " + penny);
		
	}

}
