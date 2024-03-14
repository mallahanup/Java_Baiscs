package com.basics;
import java.util.*;

abstract class Shape {
    // Method to calculate area (to be implemented by subclasses)
    abstract double calculateArea();

    // Method to display the shape type
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Define a subclass Circle inheriting from Shape
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Override the calculateArea method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Override the displayShape method
    @Override
    void displayShape() {
        System.out.println("This is a circle.");
    }
}

// Define another subclass Rectangle inheriting from Shape
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the calculateArea method
    @Override
    double calculateArea() {
        return length * width;
    }

    // Override the displayShape method
    @Override
    void displayShape() {
        System.out.println("This is a rectangle.");
    }
}
public class class7 {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Demonstrate polymorphism and abstraction
        Shape shape1 = circle;
        Shape shape2 = rectangle;

        // Calling methods
        shape1.displayShape();
        System.out.println("Area of Circle: " + shape1.calculateArea());

        shape2.displayShape();
        System.out.println("Area of Rectangle: " + shape2.calculateArea());
    }

}
