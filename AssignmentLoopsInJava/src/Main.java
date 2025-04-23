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

    }
}