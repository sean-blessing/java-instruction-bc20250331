package ui;

import java.util.List;

import db.MovieDB;
import model.Movie;
import util.ConsoleUtil;

public class BmdbConsoleApp {

	public static void main(String[] args) {
		ConsoleUtil.printHeader("Welcome to the BMDB Console App!", "-");
		
		// Get all movies from the movie table
		// SELECT * FROM Movie;
		List<Movie> movies = MovieDB.getAll();
		System.out.println("All movies: ");
		for (Movie m: movies) {
			System.out.println(m);
		}
		
		// Insert a movie into the movie table
		// INSERT INTO Movie (Title, Year, Rating, Director) VAlUES (xxx, xxx, xx, xx)
		System.out.println("Add a movie:");
		String title = ConsoleUtil.promptString("Title: ");
		int year = ConsoleUtil.promptInt("Year: ");
		String rating = ConsoleUtil.promptString("Rating: ");
		String director = ConsoleUtil.promptString("Director: ");
		Movie m = new Movie(0, title, year, rating, director);
		if (MovieDB.create(m)) {
			System.out.println("Movie created!");
		}
		else {
			System.out.println("Error creating movie.");
		}
		
		// SKIP - Update a movie
		
		// Get a movie by id
		// SELECT * FROM Movie WHERE Id = ?
		
		// Delete a movie by id
		// DELETE FROM Movie WHERE Id = ?
		
		// Get all movies
		// SELECT * (re-use code from above)
		
		
		
		System.out.println("Bye");

	}

}
