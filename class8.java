package com.basics;
interface Animal {
    void sound(); // Abstract method
}

// Implement the interface
class Dog implements Animal {
    // Implementing the sound method
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    // Implementing the sound method
    public void sound() {
        System.out.println("Cat meows");
    }
}
public class class8 {
    public static void main(String[] args) {
        // Create objects of classes implementing the interface
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call the methods
        dog.sound();
        cat.sound();
    }
}
