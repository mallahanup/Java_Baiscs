package com.basics;

public class class5 {
    // Method without parameters
    static void sayHello() {
        System.out.println("Hello!");
    }

    // Method with parameters
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method overloading
    static void greet(String name, String greeting) {
        System.out.println(greeting + ", " + name + "!");
    }

    // Method with return value
    static int add(int a, int b) {
        return a + b;
    }

    // Method with local variable and block scope
    static void printNumbers(int num) {
        int i;
        for (i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        // Variable i cannot be accessed outside the loop
        // System.out.println("Value of i: " + i); // This will result in compilation error
    }

    // Recursive method
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        sayHello(); // Calling method without parameters
        greet("Anup"); // Calling method with one parameter
        greet("Ajay", "Good morning"); // Calling overloaded method with two parameters

        int result = add(5, 3); // Calling method with return value
        System.out.println("5 + 3 = " + result);

        printNumbers(5); // Calling method with local variable and block scope

        int factorialOf5 = factorial(5); // Calling recursive method
        System.out.println("\nFactorial of 5: " + factorialOf5);
    }
}
