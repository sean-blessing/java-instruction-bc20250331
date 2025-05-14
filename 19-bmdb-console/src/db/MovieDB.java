package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Movie;

public class MovieDB {
	// See p. 635 for full ProductDB example

	// connect to the DB - p. 625
	private static Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/bmdb";
		String username = "bmdb_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		return conn;
	}

	// Get all movies from the movie table
	// SELECT * FROM Movie;
	public static List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		String sql = "SELECT * FROM Movie";

		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();) {
			// process the result set!
			// iterate through the result set
			while (rs.next()) {
				// parse rs fields into java variables
				int id = rs.getInt(1); // get by column number
				String title = rs.getString("Title"); // get by column name
				int year = rs.getInt(3);
				String rating = rs.getString(4);
				String director = rs.getString(5);
				// create an instance of Movie
				Movie m = new Movie(id, title, year, rating, director);
				// put that instance into our List
				movies.add(m);
			}
		} catch (SQLException sqle) {
			System.err.println(sqle);
		}

		return movies;
	}

	// Insert a movie into the movie table
	// INSERT INTO Movie (Title, Year, Rating, Director) VAlUES (xxx, xxx, xx, xx)
	public static boolean create(Movie m) {
		boolean success = false;
		String sql = "INSERT INTO Movie (Title, Year, Rating, Director) " + "VALUES (?, ?, ?, ?)";
		try (Connection conn = getConnection(); 
			 PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, m.getTitle());
			ps.setInt(2,  m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getDirector());
			ps.executeUpdate();
			success = true;
		} catch (SQLException sqle) {
			System.err.println(sqle);
		}

		return success;
	}

	// SKIP - Update a movie

	// Get a movie by id
	// SELECT * FROM Movie WHERE Id = ?

	// Delete a movie by id
	// DELETE FROM Movie WHERE Id = ?

	// Get all movies
	// SELECT * (re-use code from above)

}
