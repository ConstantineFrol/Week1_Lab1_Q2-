/**
 * 
 */
package Practicing2ndYear;

import java.util.Scanner;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 */
public class Week1_Lab1_Q2 {

	public static void main(String[] args) {

		// Initialize scanner
		Scanner userInput = new Scanner(System.in);

		// Initialize variables
		int userNumber = 0;
		int sumNumbers = 0;
		int counter = 0;

		// Using do-while loop
		do{

			// Ask user to input number in range 1 - 10
			System.out.println("Please enter a number from 1 to 10");

			// Validate input is it a number (integer)
			while(!userInput.hasNextInt())
			{
				// Display error and reset memory that holds last user input
				System.out.println("Invalid input\nPlease enter a number from 1 to 10");
				userInput.nextLine();
			}

			// assign variable userNumber to what ever user is going to input
			userNumber = userInput.nextInt();

			// Validate that user input is in range 1 - 10
			while( 0 > userNumber || userNumber > 10)
			{
				// Display error, reset memory that holds last user input and assign user input to variable 
				userInput.nextLine();
				System.out.println("Invalid input\nPlease enter a number from 1 to 10");
				userNumber = userInput.nextInt();
			}
			
			// Sum of all user inputs store in variable sumNumbers
			sumNumbers += userNumber;

			// Counter is used to display particular message in a console
			counter++;
			
			// Conditions when message will be displayed
			if(counter > 1 && sumNumbers < 30)
			{
				System.out.println("the sum of your numbers is: " + sumNumbers + "\n");
			}
			
			// Conditions when message will be displayed
			if(sumNumbers > 30)
			{
				System.out.println("the sum of your numbers is more that 30 ( " + sumNumbers + " )");
			}

		// Do-while will loop till this condition is true	
		}while(!(sumNumbers > 30));
		
		// Close scanner
		userInput.close();

	}

}