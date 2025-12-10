/*
A simple Java class demonstrating foundational Object-Oriented Programming concepts:
- Classes and Objects
- Attributes (instance variables)
- Constructors
- Methods that modify object state
- Encapsulation via behavior instead of direct field manipulation
*/

public class Dog {

    // Instance variables (attributes) that describe a Dog object
    public int age;
    public double weight;
    public String name;
    public String furColor;
    public String breed;

    /*
     Constructor: runs when a new Dog object is created.
     It initializes the object's state using values provided by the user.
     This shows how objects are born with specific attributes.
    */
    Dog(int a, double w, String n, String f, String b) {
        age = a;
        weight = w;
        name = n;
        furColor = f;
        breed = b;
    }

    /*
     Method representing behavior: all Dog objects can bark.
     This demonstrates how objects have both data (attributes)
     AND actions (methods) in OOP.
    */
    public void bark() {
        System.out.println("Woof! Woof!");
    }

    /*
     Method that changes the Dog's name.
     This demonstrates encapsulation — updating object state
     using behavior instead of directly modifying variables in main().
    */
    public void rename(String n) {
        name = n;
    }

    /*
     Method that updates the Dog's weight when it eats.
     Shows how object state changes over time,
     representing real-world behavior in code.
    */
    public void eat(double amountOfFood) {
        weight += amountOfFood;
    }

}
