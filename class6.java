package com.basics;
class Car {
    // Class attributes or fields
    String brand;
    String model;
    int year;
    double price;

    // Class constructor
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Class method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    // Getter method for brand attribute
    public String getBrand() {
        return brand;
    }

    // Setter method for price attribute
    public void setPrice(double price) {
        this.price = price;
    }
}
public class class6 {
    public static void main(String[] args) {
        // Creating objects of the 'Car' class
        Car car1 = new Car("Toyota", "Corolla", 2020, 20000);
        Car car2 = new Car("Honda", "Civic", 2019, 25000);

        // Calling methods on the objects
        car1.displayInfo();
        System.out.println(); // Empty line for separation
        car2.displayInfo();

        // Using getter and setter methods
        System.out.println("\nBefore price update:");
        System.out.println("Car 1 Price: $" + car1.price);
        car1.setPrice(22000); // Updating price using setter method
        System.out.println("After price update:");
        System.out.println("Car 1 Price: $" + car1.price);
    }
}
