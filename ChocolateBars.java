import java.util.Scanner; // Week 4 Homework

public class ChocolateBars
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amount of dollars you have: "); 
		int dollars = keyboard.nextInt(); // asking for the input

		int chocolate = 0, coupon = 0, addChocolate = 0; //initialize these vars
		chocolate = dollars; // for every dollar you get one chocolate
		coupon = chocolate; // you will always have a coupon in every chocolate 

		addChocolate = (coupon / 6); // 6 coupons gets you one chocolate bar

		while (addChocolate > 0)
		{
			chocolate += addChocolate; // add the additional chocolates
			coupon -= (6 * addChocolate); // decrease amount of coupons
			coupon += addChocolate; // the additional chocolates coupons
			addChocolate = (coupon / 6); // check for any more chocolates
		}
		
		System.out.println("The amount of chocolates you can get are: " + chocolate);
		System.out.println("The amount of coupons remaining: " + coupon);
	}
}
