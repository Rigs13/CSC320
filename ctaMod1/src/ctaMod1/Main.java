package ctaMod1;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Author: Semisi Rigby
 * 
 * This class will be used as the main class (driver class) for handling
 * the main logic of the program. An ArrayList will be created to store 
 * various restaurants based on type of food. The user will be prompted 
 * for the type of food desired and then will be given a restaurant in 
 * return with the name, address, city, state, and zip code.
 */

public class Main {

	public static void main(String[] args) {
		
		// create an ArrayList of restaurants
		ArrayList<Restaurant> restaurants = new ArrayList<>();
		
		// add restaurants to the ArrayList
		restaurants.add(new Restaurant("Pelican Joe's Pizzeria", "263 Eastman Park Dr.", "Windsor", 
				"CO", 80550, "Pizza"));
		restaurants.add(new Restaurant("Sol De Jalisco", "1345 Water Valley Pkwy", "Windsor", 
				"CO", 80550, "Mexican"));
		restaurants.add(new Restaurant("Hearth Restaurant and Pub", "205 1/2 4th Street", "Windsor",
				"CO", 80550, "Pub"));
		restaurants.add(new Restaurant("Windsor Mill Tavern", "301 Main Street Unit C", "Windsor",
				"CO", 80550, "Date Night"));
		restaurants.add(new Restaurant("Freddy's Frozen Custard and Steakburgers", "435 E Main Street",
				"Windsor", "CO", 80550, "Fast Food"));
		
		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		
		
		// introduction to program
		System.out.println("Welcome to the Food Selection System!");
		System.out.println("Options include: Pizza, Mexican, Pub, Date Night, and Fast Food.");
		
		// start a while loop to ensure input is contained within the ArrayList
		while (true) {
			
			System.out.println("Which kind of food would you like to try?");
			// String to store input
			String userInput = sc.nextLine();
			
			// if statements to return proper selection
			if (userInput.equalsIgnoreCase("pizza")) {
				System.out.println("Here's a recommendation for pizza: \n");
				System.out.println(restaurants.get(0));
				break;
			}
			
			else if (userInput.equalsIgnoreCase("mexican")) {
				System.out.println("Here's a recommendation for mexican food: \n");
				System.out.println(restaurants.get(1));
				break;
			}
			
			else if (userInput.equalsIgnoreCase("pub")) {
				System.out.println("Here's a recommendation for a pub: \n");
				System.out.println(restaurants.get(2));
				break;
			}
			
			else if (userInput.equalsIgnoreCase("date night")) {
				System.out.println("Here's a recommendation for date night: \n");
				System.out.println(restaurants.get(3));
				break;
			}
			
			else if (userInput.equalsIgnoreCase("fast food")) {
				System.out.println("Here's a recommendation for fast food: \n");
				System.out.println(restaurants.get(4));
				break;
			}
			
			// else case for invalid input
			else {
				System.out.println("\nInvalid input. Please select from the options provided.");
				System.out.println("Options: Pizza, Mexican, Pub, Date Night, or Fast Food.\n");
			}
			
			
		}
		
		// Show that the program is finished
		System.out.println("End of program.");
		
		// close scanner 
		sc.close();

	}

}
