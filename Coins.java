/*
 * This program gets a quantity of cents as a command-line argument.
 * It prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int numOfCents = Integer.parseInt(args[0]);
		int numOfQuarters = numOfCents / 25; // Calculates the number of quarters.
		int remainder = numOfCents % 25;// Calculates the remainder in cents.
		System.out.println("Use " + numOfQuarters + " quarters and " + remainder + " cents");
	}
}