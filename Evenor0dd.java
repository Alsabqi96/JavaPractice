import java.util.Scanner;

class EvenorOdd{
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Use conditionals to check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // Close the scanner
        scanner.close();
    }
}

