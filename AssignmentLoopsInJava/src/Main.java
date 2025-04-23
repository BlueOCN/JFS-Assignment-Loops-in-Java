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
    }
}