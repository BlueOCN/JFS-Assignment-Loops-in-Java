import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Part 1: Using For Loops
        //

        // Print Numbers
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Calculate Sum
        System.out.println();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);

        // Print Multiplication Table
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int number = sc.nextInt();
        System.out.println("Multiplication Table from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + i*number);
        }


        //TIP Part 2: Using While Loops

        // User Input
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter positive integer: ");

        // Validate input using a conditional statement and while loop
        int positiveNumber = 0;
        while (!sc2.hasNextInt() || (positiveNumber = sc2.nextInt()) <= 0) {
            System.out.print("Invalid input. Please enter a positive integer: ");
            sc2.next(); // Consume invalid input
        }

        // Sum the Digits
        int sum2 = 0;
        while (positiveNumber > 0) {
            int lastDigit = positiveNumber % 10;
            positiveNumber /= 10;
            sum2 += lastDigit;
        }

        // Output the Result
        System.out.println("The sum of the digits is: " + sum2);


        // Optional Enhancements
        Scanner sc3 = new Scanner(System.in);
        String choice;

        do {
            // User Input
            System.out.print("Enter positive integer: ");

            // Validate input using a conditional statement and while loop
            int positiveNumber2 = 0;
            while (!sc3.hasNextInt() || (positiveNumber2 = sc3.nextInt()) <= 0) {
                System.out.print("Invalid input. Please enter a positive integer: ");
                sc3.next(); // Consume invalid input
            }

            // Sum the Digits
            int sum3 = 0;
            while (positiveNumber2 > 0) {
                int lastDigit = positiveNumber2 % 10;
                positiveNumber2 /= 10;
                sum3 += lastDigit;
            }

            // Output the Result
            System.out.println("The sum of the digits is: " + sum3);

            // Ask the user if they want to continue
            System.out.print("Would you like to enter another number? (Y/N): ");
            choice = sc3.next().toUpperCase();

        } while (choice.equals("Y") || choice.equals("YES"));


        //TIP Part 3: Using Do-While Loops

        // Print Welcome
        System.out.println("Welcome to the Calculator!");

        do {
            // Print Menu
            System.out.println("\nPlease select an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            // User Input
            Scanner sc4 = new Scanner(System.in);
            System.out.print("\nEnter your choice: ");
            int operation = sc4.nextInt();
            if (operation == 5) {
                System.out.println("\nExiting the calculator. Thank you!");
                break;
            }

            System.out.print("\nEnter the first number: ");
            int inputNum1 = sc4.nextInt();
            System.out.print("Enter the second number: ");
            int inputNum2 = sc4.nextInt();
            System.out.println();

            // Compute
            int result;
            switch (operation) {
                case 1:
                    result = inputNum1 + inputNum2;
                    System.out.println("Result: " + inputNum1 + " + " + inputNum2 + " = " + result);
                    break;
                case 2:
                    result = inputNum1 - inputNum2;
                    System.out.println("Result: " + inputNum1 + " - " + inputNum2 + " = " + result);
                    break;
                case 3:
                    result = inputNum1 * inputNum2;
                    System.out.println("Result: " + inputNum1 + " * " + inputNum2 + " = " + result);
                    break;
                case 4:
                    if (inputNum2 != 0) {
                        System.out.println("Result: " + inputNum1 + " / " + inputNum2 + " = " + (inputNum1 / inputNum2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid input.");
                    break;
            }

        } while (true);
    }
}