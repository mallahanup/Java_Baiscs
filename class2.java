package com.basics;

public class class2 {
    public static void main(String[] args) {
        // Java Variables
        int num1 = 10;
        int num2 = 20;

        // Java Data Types
        double doubleNum = 10.5;
        char character = 'A';
        boolean bool = true;

        // Java Operators
        int sum = num1 + num2;
        double product = num1 * doubleNum;
        int difference = num2 - num1;
        double division = num2 / doubleNum;
        int remainder = num2 % num1;

        // Type Casting
        int intNum = 100;
        double doubleResult = (double) intNum; // Casting int to double

        // Output
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);
        System.out.println("Casting int to double: " + doubleResult);
    }
}
