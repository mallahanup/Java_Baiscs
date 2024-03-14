package com.basics;
import java.util.*;
public class class4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example of a while loop
        int count = 0;
        while (count < 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        // Example of a for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i is: " + i);
        }

        // Example of a do-while loop
        int input;
        do {
            System.out.print("Enter a positive number (or -1 to quit): ");
            input = scanner.nextInt();
            if (input == -1) {
                break; // Exit the loop if -1 is entered
            }
            if (input % 2 == 0) {
                System.out.println("Even number entered.");
                continue; // Skip the rest of the loop if an even number is entered
            }
            System.out.println("Odd number entered.");
        } while (true); // Infinite loop until -1 is entered

        System.out.println("Loop ended.");
        scanner.close();
    }
}
