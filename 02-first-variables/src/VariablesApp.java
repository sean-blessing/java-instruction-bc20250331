import java.util.Scanner;

public class VariablesApp {

	public static void main(String[] abc) {
		System.out.println("Welcome the the variables app!");
		
		String name = "Bob";
		int num1 = 5;
		int num2 = 8;
		
		Integer num3 = 11;
		num3.toString();
		
		System.out.println("Hello, "+name+". sum="+(num1+num2));
		
		double price = 11.99;
		double tax = .065;
		double total = price*(1+tax);
		System.out.println(total);
		
		// getting console input
		Scanner sc = new Scanner(System.in);
		// get a new price
		System.out.print("Enter price: ");
		price = Double.parseDouble(sc.nextLine());
		
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.println(name + price);
		
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter birth month (numeric): ");
			int birthMonth = Integer.parseInt(sc.nextLine());
			// evaluate birthMonth to determine quarter (1-3: Q1, 4-6: Q2, etc)
			String quarter = "";
			if (birthMonth <= 3) {
				quarter = "Q1";
			}
			else if (birthMonth <= 6) {
				quarter = "Q2";
			}
			else if (birthMonth <= 9) {
				quarter = "Q3";
			}
			else if (birthMonth <= 12) {
				quarter = "Q4";
			}
			else {
				quarter = "ERR";
			}
			
			System.out.println("Quarter: "+quarter);
			System.out.print("\nContinue (y/n)? ");
			choice = sc.nextLine();
		}
		
		System.out.println("Bye");
	}
}
