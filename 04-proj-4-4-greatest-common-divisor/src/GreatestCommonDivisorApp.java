import java.util.Scanner;

public class GreatestCommonDivisorApp {

	public static void main(String[] args) {
		// hello/welcome
		System.out.println("Welcome to Greatest Common Divisor App!");
		// initialization
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		while (choice.equalsIgnoreCase("y")) {
			// prompt for input: x, y
			System.out.print("\nEnter first number: ");
			int x = Integer.parseInt(sc.nextLine());
			System.out.print("Enter second number: ");
			int y = Integer.parseInt(sc.nextLine());
			
			// biz logic: compute gcd
			while (x != 0) {
				while (x <= y) {
					y -= x;
				}
				// swap
				int oldY = y;
				y = x;
				x = oldY;
			}
			
			// print result: gcd
			System.out.println("Greatest common divisor: "+ y);
			System.out.print("Continue (y/n)? ");
			choice = sc.nextLine();
		}
		
		// goodbye
		System.out.println("Bye");

	}

}
