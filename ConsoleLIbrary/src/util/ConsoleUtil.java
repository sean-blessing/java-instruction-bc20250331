package util;

import java.util.Scanner;

public class ConsoleUtil {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int promptInt(String prompt) {
		int nbr = 0;
		boolean success = false;
		while (!success) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				nbr = Integer.parseInt(sc.nextLine());
				success = true;
			} else {
				System.out.println("Error - invalid whole number.");
				sc.nextLine();
			}
		}
		return nbr;
	}
	
	public static int promptInt(String prompt, int min, int max) {
		boolean success = false;
		int nbr = 0;
		while (!success) {
			nbr = promptInt(prompt);
			if (nbr >= min && nbr <= max ) {
				success = true;
			}
			else {
				System.out.println("Error - value must be within range: "+min+" to "+max);
			}
		}
		
		return nbr;
	}
	
	public static String promptString(String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}
	
	public static String promptString(String prompt, String v1, String v2) {
		boolean success = false;
		String str = "";
		while (!success) {
			str = promptString(prompt);
			if (!str.equalsIgnoreCase(v1) && !str.equalsIgnoreCase(v2)) {
				System.out.println("Error - input must be "+v1+ " or "+v2);
			}
			else {
				success = true;
			}
		}
		
		
		return str;
	}
	
	public static void printHeader(String header, String sep) {
		System.out.println(header);
		// print a line of sep equal to the length of header - ch14
		int len = header.length();
		String sepLine = "";
		for (int i=0; i < len; i++) {
			sepLine += sep;
		}
		System.out.println(sepLine);
		System.out.println();
	}
	
	public static void printHeader(String header) {
		printHeader(header, "-");
	}

}
