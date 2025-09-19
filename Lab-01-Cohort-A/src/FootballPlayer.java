// Author - Joshua Adjie
// Date - 19-Sep-2025
// Task 1

// imports
import java.util.Scanner;

public class FootballPlayer {

	public static void main(String[] args) {

		// Declaration of variable for players
		String name;
		int age;
		float height;
		float weight;
		int jersey_num;

		// Take user's input with Scanner (try-with-resources to auto open and close Scanner)
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Kindly input player details");
			System.out.println(); // Print a new line

			System.out.print("Enter player's name: ");
			name = input.nextLine();
			System.out.println("Enter player's age: ");
			age = input.nextInt();
			System.out.println("Enter player's height (in meters): ");
			height = input.nextFloat();
			System.out.println("Enter player's weight (in pounds): ");
			weight = input.nextInt();
			System.out.println("Enter player's jersey number: ");
			jersey_num = input.nextInt();
		}
	}
}
