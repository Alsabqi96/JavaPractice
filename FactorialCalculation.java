import java.util.Scanner;
public class FactorialCalculation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Initialize the result for factorial calculation
        long factorial = 1;

        // Check if the number is negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate the factorial using a loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Output the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }
}
