package COLLECTIONS.Java8Features;

/*
A Functional Interface is an interface with exactly one abstract method (SAM – Single Abstract Method).

It can have:
Any number of default methods (with implementation).
Any number of static methods.
But only one abstract method.
➡️ This makes it ideal for Lambda Expressions and Method References.

Why are Functional Interfaces Important?

✅ Enable Lambda Expressions
✅ Make code more concise & readable
✅ Used heavily in Streams API, Collections, Concurrency
✅ Replaces anonymous classes for better performance
 */


@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello(String name); // The single abstract method
    // Default method
    default void greet() {
        System.out.println("This is a default method.");
    }
    // Static method
    static void printInfo() {
        System.out.println("This is a static method.");
    }
}
public class functionalInterfaceDemo {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface obj=(name)-> System.out.println("Hello, "+name);
        obj.sayHello("raju");
        obj.greet(); // Calling the default method
        MyFunctionalInterface.printInfo(); // Calling the static method
    }

}
