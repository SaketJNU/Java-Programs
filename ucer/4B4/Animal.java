class Animal {
    // Instance variable
    String name;

    // Method to make a generic sound
    public void makeSound() {
        System.out.println("Some sound...");
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

// Dog.java
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog();

        // Set the dog's name
        myDog.setName("Buddy");

        // Call makeSound()
        myDog.makeSound();

        // Print the dog's name
        System.out.println("Dog's name is: " + myDog.getName());
    }
}
