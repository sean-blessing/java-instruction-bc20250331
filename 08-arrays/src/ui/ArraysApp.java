package ui;

import java.util.Arrays;

import util.ConsoleUtil;

public class ArraysApp {

	public static void main(String[] args) {
		ConsoleUtil.printHeader("Welcome to the Arrays App!", "+");
		
		// array of integers
		int[] numbers = new int[5];
		numbers[0] = 7;
		numbers[1] = 35;
		numbers[2] = 21;
		numbers[3] = -7;
		numbers[4] = 95;
		
		System.out.println(numbers);
		for (int n: numbers) {
			System.out.println(n);
		}
		
		// another array of integers
		int[] numbers2 = {56, 32, 17, 4, 256, 1};
		for (int n: numbers2) {
			System.out.println(n);
		}
		
		//numbers[5] = 40; -> out of bounds exception
		
		ConsoleUtil.printHeader("even numbers");
		int[] numbers3 = {1,2,3,4,5,6,7,8,9,10};
		// print even numbers
		for (int i=1; i < numbers3.length; i+=2) {
			System.out.println(numbers3[i]);
		}
		// print even numbers - backwards
		for (int i=numbers3.length - 1; i >= 0; i-=2) {
			System.out.println(numbers3[i]);
		}
		
		Arrays.sort(numbers);
		ConsoleUtil.printHeader("Sorted numbers:");
		for (int n: numbers) {
			System.out.println(n);
		}
		
		System.out.println(Arrays.toString(numbers3));
		
		
		
		
		System.out.println("Bye!");

	}

}
