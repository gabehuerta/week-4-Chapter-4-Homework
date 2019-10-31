import java.util.Scanner; // Week 4 Homework

public class ValidVendingMachine2
{
	public static void main(String[] args)
	{
	
	int paid, amount, quarter, dime, nickel, penny;
	boolean valid = false;
	
	do {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the price of an item");
		System.out.println("from 25 cents to a dollar,");
		System.out.println("in 5-cent increments: ");
		paid = keyboard.nextInt();
	
		if (paid < 25) {
			System.out.println("\n The input amount must be more than 25 cents.");
		} else 
			if(paid > 100) {
				System.out.println("\n The input amount must be less than 100 (one dollar).");
		} else 
			if (paid % 5 != 0) {
				System.out.println("\n The input amount must be divisible by 5 (must be entered in 5-cent increments only, as stated above.");
		} else
			valid = true;

		} while (!valid);
		
		if (paid == 100) {
			System.out.println("\n You bought an item for one dollar, so there is no change.");
		}
		else {
			amount = (100 - paid);
			quarter = (amount / 25);
			amount = (amount % 25);
			dime = (amount / 10);
			amount = (amount % 10);
			nickel = (amount / 5);
			amount = (amount % 5);
			penny = (amount);

			System.out.println("You bought an item for " + paid + " cents and gave me a dollar, so your change is: ");
			System.out.println(quarter + " quarters");
			System.out.println(dime + " dimes");
			System.out.println(nickel + " nickels");
			System.out.println(penny + " pennies");
	}
    }
}

