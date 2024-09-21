import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize a variable to store the sum of digits
        int sum = 0;

        // Use a loop to calculate the sum of digits
        while (number != 0) {
            // Get the last digit using modulo 10 and add it to the sum
            sum += number % 10;
            // Remove the last digit by dividing the number by 10
            number /= 10;
        }

        // Output the result
        System.out.println("The sum of the digits is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
