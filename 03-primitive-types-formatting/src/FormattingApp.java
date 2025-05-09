import java.text.NumberFormat;
import java.util.Scanner;

public class FormattingApp {

	public static void main(String[] args) {
		System.out.println("Welcome to chapter 3!");
		Scanner sc = new Scanner(System.in);
		// constants
		final int MONTHS_IN_YEAR = 12;
		final double SALES_TAX = .0675;
		
		// Math class
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Generating a random #: ");
			double r1 = Math.random();
			//double r2 = Math.rint(10);
			System.out.print(r1);
			int dieRoll = (int)(Math.random() * 6) + 1;
			System.out.println("\ndie roll: "+dieRoll);
			double r2 = r1 * 100;
			System.out.println("r2 = "+r2);
			System.out.println("r2 rounded = "+Math.round(r2));
			double r3 = (double)Math.round(r2 * 100) / 100;
			System.out.println("r3 (2 decimal places): "+r3);
			
			System.out.println("convert to currency: ");
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
			System.out.println("r3 currency: "+currencyFormatter.format(r3));
			System.out.print("\ncontinue? ");
			choice = sc.nextLine();
		}
		
		
		System.out.println("Bye");

	}

}
