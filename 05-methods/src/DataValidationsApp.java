import java.util.Scanner;

public class DataValidationsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the data validation app!");
		Scanner sc = new Scanner(System.in);

		// get an int - exception handling
		int n1 = promptInt("Enter a whole number: ", sc);
		int n2 = promptInt("Enter another whole number: ", sc);

		// print the sum
		int sum = n1 + n2;
		System.out.println("Sum = " + sum);

		double interestRate = promptDouble("Enter the interest rate: ", sc);

		sc.close();
		System.out.println("Bye");
	}

	private static double promptDouble(String prompt, Scanner sc) {
		double interestRate = 0.0;
		boolean success = false;
		while (!success) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				interestRate = Double.parseDouble(sc.nextLine());
				success = true;
			} else {
				System.out.println("Error - enter valid double.");
				sc.nextLine();
			}
		}
		return interestRate;
	}

	// method - validate whole number entry
	private static int promptInt(String prompt, Scanner sc) {
		// get an int
		int nbr = 0;
		boolean success = false;
		while (!success) {
			System.out.print(prompt);
			try {
				nbr = Integer.parseInt(sc.nextLine());
				success = true;
			} catch (NumberFormatException nfe) {
				System.out.println("Error - invalid whole number.");
			}
		}
		return nbr;
	}
}
