// Abstract class can have both abstract method and normal method
// Used to keep the things hidden

abstract class Animal {

    // Instance variable
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (to be implemented by subclasses)
    public abstract void sound();

    // Regular method
    public void description() {
        System.out.println(name + " is a lovely animal.");
    }
}

// Subclass Dog that extends Animal and implements the abstract method
class Dog1 extends Animal {

    // Constructor
    public Dog1(String name) {
        super(name);  // Call the parent constructor
    }

    // Implement the abstract method sound
    public void sound() {
        System.out.println(name + " barks!");
    }
}

// Subclass Cat that extends Animal and implements the abstract method
class Cat extends Animal {

    // Constructor
    public Cat(String name) {
        super(name);  // Call the parent constructor
    }

    // Implement the abstract method sound
    public void sound() {
        System.out.println(name + " meows!");
    }
}

// Main class to test the code
public class abstraction {
    public static void main(String[] args) {

        // Create objects of Dog and Cat
        Animal dog = new Dog1("Buddy");
        Animal cat = new Cat("Whiskers");

        // Call methods
        dog.sound();       // Output: Buddy barks!
        dog.description(); // Output: Buddy is a lovely animal.

        cat.sound();       // Output: Whiskers meows!
        cat.description(); // Output: Whiskers is a lovely animal.
    }
}
