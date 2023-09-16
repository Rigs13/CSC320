package ctaMod1;

/*
 * Author: Semisi Rigby
 * 
 * This class will be used to represent a restaurant class blueprint
 * for returning name, address, city, state, and zip code for selection
 * from the main class (driver class).
 */

public class Restaurant {
	
	// attributes
	private String name;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String foodType;
	
	// parameterized constructor
	public Restaurant (String name, String address, String city, String state, 
			int zip, String foodType) {
		
		// refer to params to instance of self
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.foodType = foodType;
		
	}
	
	// getters for attributes
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public String getFoodType() {
		return foodType;
	}
	
	// override toString method for displaying information
	@Override
	public String toString() {
		return "Name: " + name + "\nAddress: " + address + "\nCity: " + city +
				"\nState: " + state + "\nZip: " + zip; 
	}
	
	
}
