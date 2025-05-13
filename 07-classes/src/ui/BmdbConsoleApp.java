package ui;

import java.time.LocalDate;

import model.Actor;
import model.Movie;
import util.ConsoleUtil;

public class BmdbConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the BMDB app!");
		
		Movie m1 = new Movie(1, "Star Wars", 1977, "PG", "George Lucas");
		System.out.println(m1.toString());
		
		Movie m2 = new Movie();
		m2.setId(2);
		m2.setTitle("Some Cool Movie");
		m2.setYear(2025);
		m2.setRating("R");
		m2.setDirector("Test");
		
		System.out.println(m2);
		
		System.out.println("Create an actor");
		int id = ConsoleUtil.promptInt("ID: ");
		String firstName = ConsoleUtil.promptString("First Name: ");
		String lastName = ConsoleUtil.promptString("Last Name: ");
		String gender = ConsoleUtil.promptString("Gender: ", "M", "F").toUpperCase();
		int month = ConsoleUtil.promptInt("Birth Month: ", 1, 12);
		int day = ConsoleUtil.promptInt("Birth Day: ", 1, 31);
		int year = ConsoleUtil.promptInt("Birth Year: ", 1900, Integer.MAX_VALUE);
		LocalDate birthDate = LocalDate.of(year, month, day);
		Actor a1 = new Actor(id, firstName, lastName, gender, birthDate);
		
		System.out.println(a1);
		
		System.out.println("Bye");

	}

}
