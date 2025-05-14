package ui;

import java.text.NumberFormat;

import util.ConsoleUtil;

public class SalesReportApp {
	private static double[][] sales = {
			{ 1540.0, 2010.0, 2450.0, 1845.0 }, // Region 1
			{ 1130.0, 1168.0, 1847.0, 1491.0 }, // Region 2
			{ 1580.0, 2305.0, 2710.0, 1284.0 }, // Region 3
			{ 1105.0, 4102.0, 2391.0, 1576.0 } // Region 4
	};

	public static void main(String[] args) {
		ConsoleUtil.printHeader("Welcome to the Sales Report App!", "=");
		NumberFormat currFormat = NumberFormat.getCurrencyInstance();
		// sales by quarter for each region
		String rowStr = "Region\tQ1\t\tQ2\t\tQ3\t\tQ4";
		System.out.println(rowStr);
		for (int row = 0; row < sales.length; row++) {
			rowStr = (row + 1) + "\t";
			for (int col = 0; col < sales[row].length; col++) {
				rowStr += currFormat.format(sales[row][col]) +"\t";
			}
			System.out.println(rowStr);
		}
		System.out.println();
		
		// sales by region
		ConsoleUtil.printHeader("Sales by Region", "-");
		for (int row = 0; row < sales.length; row++) {
			rowStr = "Region "+(row + 1) + ": ";
			double regionSum = 0.0;
			for (int col = 0; col < sales[row].length; col++) {
				regionSum += sales[row][col];
			}
			rowStr += currFormat.format(regionSum);
			System.out.println(rowStr);
		}
		System.out.println();
		
		// sales by quarter
		ConsoleUtil.printHeader("Sales by Quarter", "-");
		for (int col = 0; col < sales.length; col++) {
			rowStr = "Q"+(col + 1) + ": ";
			double quarterSum = 0.0;
			for (int row = 0; row < sales[col].length; row++) {
				quarterSum += sales[row][col];
			}
			rowStr += currFormat.format(quarterSum);
			System.out.println(rowStr);
		}
		System.out.println();
		
		// total annual sales

	}

}
