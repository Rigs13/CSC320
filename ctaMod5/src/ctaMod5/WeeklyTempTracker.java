package ctaMod5;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Semisi Rigby
 * This class is used to display an idea for associating two ArrayLists
 * within Java to a switch case structure in which a user can input a day 
 * of the week to return the associated temperature of that day. If week is input
 * then the average temperature is returned from the week.
 */

public class WeeklyTempTracker {

	// driver (main method)
	public static void main(String[] args) {
		
		// create scanner instance
		Scanner sc = new Scanner(System.in);
		
		// Arrays for days/temperatures to convert to ArrayLists
		String daysArr [] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int tempArr [] = {69, 73, 82, 70, 75, 76, 77};
		
		// creation of days ArrayList using a for loop
		ArrayList<String> week = new ArrayList<>();
		for (int i = 0; i < daysArr.length; i++) {
			week.add(new String(daysArr[i]));
		}
		// trim to size
		week.trimToSize();
		
		// creation of temperatures ArrayList using a for loop
		ArrayList<Integer> temps = new ArrayList<>();
		for (int i = 0; i < tempArr.length; i++) {
			temps.add(tempArr[i]);
		}
		// trim to size
		temps.trimToSize();
		
		// Calculating the average temperature for the week
		double tempSum = 0;
		// iterate over temps ArrayList and add to a running total
		for (int i = 0; i < temps.size(); i++) {
			tempSum += temps.get(i);
		}
		double avgTemp = tempSum / 7;
		
		 // System.out.printf("Average Temperature of the week: %.2f", avgTemp);
		
		// collecting user input for switch case structure
		System.out.println("Weekly Temperature Tracker");
		System.out.println("Enter a day of the week to return the associated temperature: ");
		String input = sc.nextLine();
		
		// switch case based on user input (non-case sensitive)
		switch (input.toLowerCase()) {
		
		case "sunday":
			System.out.println("\nSelected Day: " + input);
			System.out.println("Temperature of " + input + ": " + temps.get(0) + " degress Fahrenheit.");
			break;
			
		case "monday":
			System.out.println("\nSelected Day: " + input);
			System.out.println("Temperature of " + input + ": " + temps.get(1) + " degress Fahrenheit.");
			break;
			
		case "tuesday":
			System.out.println("\nSelected Day: " + input);
			System.out.println("Temperature of " + input + ": " + temps.get(2) + " degress Fahrenheit.");
			break;
			
		case "wednesday":
			System.out.println("\nSelected Day: " + input);
			System.out.println("Temperature of " + input + ": " + temps.get(3) + " degress Fahrenheit.");
			break;
			
		case "thursday":
			System.out.println("\nSelected Day: " + input);
			System.out.println("Temperature of " + input + ": " + temps.get(4) + " degress Fahrenheit.");
			break;
			
		case "friday":
			System.out.println("\nSelected Day: " + input);
			System.out.println("Temperature of " + input + ": " + temps.get(5) + " degress Fahrenheit.");
			break;
			
		case "saturday":
			System.out.println("\nSelected Day: " + input);
			System.out.println("Temperature of " + input + ": " + temps.get(6) + " degress Fahrenheit.");
			break;
			
		case "week":
			System.out.println("\nSelected Day: " + input);
			System.out.printf("Average Temperature of the week: %.2f", avgTemp);
			break;
			
		default:
			System.out.println("\nUnexpected input was given.");
			break;
		
		} // end of switch structure
		
		// close the scanner
		sc.close();
		
	}

}
