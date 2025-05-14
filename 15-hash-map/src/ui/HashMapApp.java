package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.ConsoleUtil;

public class HashMapApp {

	public static void main(String[] args) {
		ConsoleUtil.printHeader("Welcome to the HashMap App!", "=");
		
		// create a HashMap of state abbreviations and names
		// OH - Ohio, IN - Indiana, WY - Wyoming, CO - Colorado
		
		// var keyword - Java 10
		//var statesMap = new HashMap<String, String>();
		HashMap<String, String> statesMap = new HashMap<>();
		statesMap.put("OH", "Ohio");
		statesMap.put("IN", "Indiana");
		statesMap.put("KY", "Kentucky");
		statesMap.put("FL", "Florida");
		
		System.out.println("OH: "+ statesMap.get("OH"));
		
		// existence
		System.out.println("Is KY in the map? "+ statesMap.keySet().contains("KY"));
		
		System.out.println("What states are stored?");
		for (Map.Entry<String, String> entry: statesMap.entrySet()) {
			System.out.println("Entry: "+entry.getKey()+"-"+entry.getValue());
		}
		
		System.out.println("Alphabetical List of States:");
		// sort the keyset into a list (can't sort a set)
		List<String> sortedAbvs = new ArrayList<>(statesMap.keySet());
		Collections.sort(sortedAbvs);
		for (String abv: sortedAbvs) {
			System.out.println(abv + "-" + statesMap.get(abv));
		}

		System.out.println("Bye");

	}

}
