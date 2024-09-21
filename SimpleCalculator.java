import java.util.Scanner;

public class SimpleCalculator {

    static String[] menuOptions = {"Add", "Subtract", "Divide", "Multiply", "Exit"};

    static Boolean exitSign = false;

    public static void main(String[] args) {
        while (exitSign == false) {
            menuForCalculator();
            int input = userInput();
            if (input == 5) {
                exit();
            } else {
                menuResolver(input);
            }
        }

    }

    public static void menuForCalculator() {
        System.out.println("Hi, Welcome to the calculator");
        System.out.println("This is the menu for calculator");
        int optionNumber = 0;
        for (String option : menuOptions) {
            optionNumber++;
            System.out.println(optionNumber + "- " + option);
        }
    }

    public static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static int divide(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

    public static int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static void exit() {
        exitSign = true;
    }


    public static int userInput() {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter your choice from menu:");
        int option = inputObj.nextInt();
        return option;
    }

    public static void menuResolver(int optionNumber) {


        int[] inputs = inputForCalculator();
        int firstNumber = inputs[0];
        int secondNumber = inputs[1];

        int finalResult = 0;

        if (optionNumber == 1) {
            finalResult = addition(firstNumber, secondNumber);
        } else if (optionNumber == 2) {
            finalResult = subtract(firstNumber, secondNumber);
        } else if (optionNumber == 3) {
            finalResult = divide(firstNumber, secondNumber);
        } else if (optionNumber == 4) {
            finalResult = multiply(firstNumber, secondNumber);
        } else {
            exit();
        }
        System.out.println("Your result is: " + finalResult);
    }

    public static int[] inputForCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        int[] inputsArray = {firstNumber, secondNumber};
        return inputsArray;

    }
}


