/*
 * This program gets two integers a, b as command-line arguments.
 * It generates three random integers, each in a given range [a,b), then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// Generates three random integers , and prints each integer in a new line.
		int num1 = (int) (Math.abs(b - a) * Math.random() + Math.min(a, b));
		System.out.println(num1);
		int num2 = (int) (Math.abs(b - a) * Math.random() + Math.min(a, b));
		System.out.println(num2);
		int num3 = (int) (Math.abs(b - a) * Math.random() + Math.min(a, b));
		System.out.println(num3);
		int min = Math.min(num1, Math.min(num2, num3)); // Computes the minimal number that was generated.
		System.out.println("The minimal generated number was " + min); // Prints the minimal number that was generated.
	}
}
