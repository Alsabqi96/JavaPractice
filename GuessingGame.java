import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int guess = 0;  // To store the user's guess
        int attempts = 0;  // To keep track of the number of attempts

        // Game loop
        System.out.println("Welcome to the Guessing Game! Try to guess the number between 1 and 100.");
        while (guess != randomNumber) {
            // Ask the user to enter a guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;  // Increment the attempt count

            // Give the user a hint based on their guess
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
        }

        // The user has guessed the correct number
        System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");

        // Close the scanner
        scanner.close();
    }
}
