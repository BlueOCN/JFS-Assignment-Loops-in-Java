# JFS-Assignment-Loops-in-Java
By the end of this assignment, you should be able to:  Understand the syntax and structure of for loops, while loops, and do-while loops. Use loops to iterate over a range of values and perform repetitive tasks based on a condition. Perform basic operations within loops like arithmetic operations, string manipulation, and conditional checks.

### Assignment Objectives

By the end of this assignment, you should be able to:

1. Understand the syntax and structure of for loops, while loops, and do-while loops.
2. Use loops to iterate over a range of values and perform repetitive tasks based on a condition.
3. Perform basic operations within loops like arithmetic operations, string manipulation, and conditional checks.

### Assignment Summary:

Loops allow programs to complete repetitive tasks while a certain condition is met.
For loops allow you to execute a block of code a specified number of times, commonly known when the number of iterations is known before entering the loop.
While loops check a condition before executing code and runs continuously until the condition is not met.
Do-while loops perform similarly to while loops, but executes code once before checking the condition.

---

## Part 1: Using For Loops

### Introduction: 
For loops are a fundamental control structure in Java that allows you to execute a block of code a specific number of times. In this assignment, you will learn how to use for loops to perform repetitive tasks.

Syntax:
```
for (initialization; condition; increment/decrement) { // code }
```
Example:
```
for (int i = 0; i < 5; i++) {
    // perform a task
}
```
### Assignment Tasks:

1. Print Numbers:
    - Write a for loop that prints the numbers from 1 to 10.
2. Calculate Sum:
    - Write a for loop that calculates the sum of the first 10 positive integers and prints the result.
3. Print Multiplication Table:
    - Write a for loop that prints the multiplication table of a number provided by the user (from 1 to 10).

---

## Part 2: Using While Loops

### Introduction: 
While loops are another fundamental control structure in Java that allows you to execute a block of code as long as a specified condition is true. By creating a program that sums the digits of a given number, you will learn how to use while loops to perform tasks that require repeated execution based on a condition.

Syntax:
```
while (condition) { // code }
```
Example:
```
int i = 0;
while (i < 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```

### Assignment Tasks:

1. User Input:
    - Write a Java program that prompts the user to enter a positive integer.
    - Use a Scanner object to read user input.
2. Sum the Digits:
    - Use a while loop to calculate the sum of the digits of the entered number.
    - Continuously extract the last digit of the number and add it to a running total.
    - Remove the last digit from the number using integer division.
3. Output the Result:
    - Once the sum of the digits has been calculated, print the result to the user.
4. Optional Enhancements:
    - Add input validation to ensure the user enters a positive integer.
    - Allow the user to enter multiple numbers and calculate the sum of the digits for each one until they choose to exit.

Example Output:
```
Enter a positive integer: 12345
The sum of the digits is: 15
```

---

## Part 3: Using Do-While Loops

### Introduction: 
Do-while loops are similar to while loops, but the block of code is executed at least once before the condition is tested. In this assignment, you will expand on the basic calculator assignment from the previous module and learn how to use do-while loops to perform tasks that require at least one execution before checking the condition.

Syntax:
```
do { // code } while (condition);
```
Example:
```
int i = 0;
do {
    System.out.println("Iteration: " + i);
    i++;
} while (i < 5);
```
### Assignment Tasks:

1. Menu-Driven Calculator:
    - Write a menu-driven program using a do-while loop that repeatedly displays a menu with options to add, subtract, multiply, and divide two numbers.
    - The user should be able to choose an option, perform the operation, and see the result.
    - The program should exit only when the user chooses an exit option.

Example Output:
```
Welcome to the Calculator!

Please select an operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit

Enter your choice: 1

Enter the first number: 10
Enter the second number: 5

Result: 10 + 5 = 15

Please select an operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit

Enter your choice: 5

Exiting the calculator. Thank you!
```
