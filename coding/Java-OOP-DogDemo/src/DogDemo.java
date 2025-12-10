import java.util.Scanner;

/*
This program demonstrates how to:
- Collect user input
- Create an object from a custom class (Dog)
- Access and display object attributes
- Call methods that change object state
- Model real-world actions in OOP
*/

public class DogDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Collecting values used to construct a Dog object
        System.out.println("You are about to create a dog");

        System.out.print("How old is the dog: ");
        int age = scan.nextInt();

        System.out.print("How much does the dog weigh: ");
        double weight = scan.nextDouble();

        System.out.print("What is the dog's name: ");
        String name = scan.next();

        System.out.print("What color is the dog: ");
        String fur = scan.next();

        System.out.print("What breed is the dog: ");
        String breed = scan.next();

        /*
         Creating a Dog object using the constructor.
         This shows object instantiation — turning user input
         into a structured object with attributes and behaviors.
        */
        Dog d1 = new Dog(age, weight, name, fur, breed);

        // Displaying the dog's initial state using object attributes
        System.out.println(d1.name + " is a " + d1.age + " year old " + d1.furColor + " " + d1.breed + " that weighs " + d1.weight + " lbs.");

        // Calling a behavior (method) defined inside Dog
        d1.bark();

        // Demonstrating how methods modify internal state
        System.out.print(d1.name + " is hungry, how much should he eat: ");
        double amountOfFood = scan.nextDouble();
        d1.eat(amountOfFood);

        // Demonstrating encapsulation — rename using method instead of direct variable access
        System.out.print(d1.name + " isn't a very good name. What should they be renamed to: ");
        String newName = scan.next();

        d1.rename(newName);

        // Shows updated object state after calling methods
        System.out.println(d1.name + " is a " + d1.age + " year old " + d1.furColor + " " + d1.breed + " that weighs " + d1.weight + " lbs.");
    }
}
