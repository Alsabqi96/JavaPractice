import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }

        // Check for factors other than 1 and the number itself
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If a factor is found, the number is not prime
            }
        }

        return true; // If no factors are found, the number is prime
    }
}
