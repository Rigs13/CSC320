package cta4;
import java.util.Scanner;

public class GradeStats {

	// main method
	public static void main(String[] args) {
		
		//create scanner object
		Scanner sc = new Scanner(System.in);

		// Initialize vars to store total for average and max/min grades
		double total = 0.0;
		double maxGrade = 0.0;
		double minGrade = 100.0;
		
		// boolean to ensure valid input type
		boolean validInput = true;
		
		// create a for loop to ask for grades from the user
		for (int i = 1; i < 11; i++) {
			while (validInput) {
				
				try {
					System.out.println("Enter grade " + i + ":");
					// store input into grade var
					double grade = sc.nextDouble();
					// add grade to total
					total += grade;
					
					// determine if grade is new max or min
					if (grade > maxGrade) {
						maxGrade = grade;
					}
					
					if (grade < minGrade) {
						minGrade = grade;
					}
					// break while loop
					break;
					
				}
				catch (java.util.InputMismatchException e){
					
					// error message for invalid input
					System.out.println("Invalid input was detected. Please use a float format.");
					// Clear scanner input
					sc.nextLine();
					
				}
				
			}
			
			
		}
	
		// close scanner
		sc.close();
		
		// Calculate average
		double averageGrade = total / 10;
		
		// Display yielded results
		System.out.println("\nAverage Grade: " + averageGrade);
		System.out.println("Maximum Grade: " + maxGrade);
		System.out.println("Minimum Grade: "+ minGrade);
		
	} // end of main method

} // end of class
