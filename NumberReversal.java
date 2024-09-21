import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize variable for the reversed number
        int reversedNumber = 0;

        // Reverse the digits of the number using a loop
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        // Output the reversed number
        System.out.println("The reversed number is: " + reversedNumber);

        // Close the scanner
        scanner.close();
    }
}

//jhbbhjbjn