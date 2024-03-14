package com.basics;
import java.util.*;
public class class1 {
    public static void main(String[] args) {

        // Declaration of variables
        int num1, num2, sum;

        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the first number
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt(); // Reading the first number

        // Prompting the user to enter the second number
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt(); // Reading the second number

        // Closing the Scanner object
        scanner.close();

        // Performing addition
        sum = num1 + num2;

        // Printing the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
