package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Movie;
import util.ConsoleUtil;

public class ArrayListApp {

	public static void main(String[] args) {
		ConsoleUtil.printHeader("Welcome to Array Lists!");

		List<Double> prices = new ArrayList<>();
		prices.add(11.99);
		prices.add(45.99);
		prices.add(25.50);
		
		System.out.println(prices);
		
		System.out.println("remove elememnt 1");
		prices.remove(1);
		System.out.println(prices);
		System.out.println(prices.size());
		
		prices.add(1, 14.44);
		System.out.println(prices);
		
		prices.set(1, 100.11);
		System.out.println(prices);
		
		double p1 = 34.99;
		prices.add(p1);
		prices.get(1);
		
		// Create some movies and put 'em in a list
		List<Movie> movies = new ArrayList<>();
		Movie m1 = new Movie(1, "Star Wars Episode IV - A New Hope", 1977, "PG", "George Lucas");
		movies.add(m1);
		movies.add(new Movie(2, "Pulp Fiction", 1994, "R", "Quentin Tarantino"));
		movies.add(new Movie(3, "finding Nemo", 2003, "G", "Andrew Stanton, Lee Unkrich"));
		movies.add(new Movie(4, "zootopia", 2016, "PG", "Bunch o directors"));
		ConsoleUtil.printHeader("Movies:");
		for (Movie m: movies) {
			System.out.println(m);
		}
		
		ConsoleUtil.printHeader("Movies - sorted:");
		movies.sort(null);
		for (Movie m: movies) {
			System.out.println(m);
		}		
		
		System.out.println("Bye");
	}

}
