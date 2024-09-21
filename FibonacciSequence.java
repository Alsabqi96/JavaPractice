import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of Fibonacci numbers to print
        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = scanner.nextInt();

        // Check if the user input is valid
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize the first two Fibonacci numbers
            int first = 0, second = 1;

            // Print the Fibonacci sequence
            System.out.println("Fibonacci sequence up to " + n + " terms:");
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                // Calculate the next number in the sequence
                int next = first + second;
                first = second;
                second = next;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
