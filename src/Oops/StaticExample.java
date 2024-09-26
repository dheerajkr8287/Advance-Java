package Oops;
/*
In Java, static methods belong to the class itself rather than to instances
 of the class. This means that static methods can be called without creating an
 instance of the class. Non-static methods, on the other hand, belong to instances
of the class and require an instance of the class to be invoked.
 */



/*

1. Direct Call to Non-Static Method:

If you try to call a non-static method directly from a static method,
you’ll encounter a compilation error. This is because static methods cannot
 directly access instance methods or instance variables without creating
 an instance of the class.


public class StaticExample {

    // Non-static method
    public void instanceMethod() {
        System.out.println("Instance method called");
    }

    // Static method
    public static void staticMethod() {
        instanceMethod(); // This will cause a compilation error
    }

    public static void main(String[] args) {
        staticMethod(); // Entry point of the program
    }
}

 */


/*
2. Calling Non-Static Method via an Instance
To call a non-static method from a static method, you must first create an instance of the class and then use that instance to call the non-static method.


 */


public class  StaticExample {
    // Non-static method
    public void instanceMethod() {
        System.out.println("Instance method called");
    }

    // Static method
    public static void staticMethod() {
        StaticExample example = new StaticExample(); // Create an instance of the class
        example.instanceMethod(); // Call the non-static method using the instance
    }

    public static void main(String[] args) {
        staticMethod(); // Entry point of the program
    }
}


/*
3. Why Static and Non-Static Methods Have Different Access Rules
Static Methods: Static methods are associated with the class itself, not with any particular instance. They can be called without creating an instance of the class. They cannot access instance methods or instance variables directly because there is no specific instance context in which to operate.

Non-Static Methods: Non-static methods (instance methods) belong to an instance of the class. They can access instance variables and other instance methods directly. They can also access static methods and static variables because static methods and variables are shared across all instances of the class.

Summary
You cannot call a non-static method directly from a static method in Java. Instead, you need to create an instance of the class and use that instance to call the non-static method. This is due to the different contexts in which static and non-static methods operate.
 */

