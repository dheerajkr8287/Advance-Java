package Oops;
/*
1. Object Class:
-->The Object class is the root superclass of all classes in Java. Every class in Java, directly or indirectly, extends the Object class, whether you explicitly specify it or not.
-->The Object class provides a common set of methods (like toString(), equals(), hashCode(), etc.) that every class in Java inherits.
-->Key Point: The Object class is at the top of Java’s class hierarchy, and every other class in Java inherits from it either directly or indirectly.

 */
// MyClass implicitly extends Object
class Myclass2{

    Object print(){
        System.out.println("hello");
        return null;
    }
    @Override
    public String toString(){// Method inherited from the Object class

        return "dheeraj";
    }


}


/*
2. -->Parent Class (Superclass):
A parent class (also called superclass) is any class that another class extends.
When a class is created using inheritance (with the extends keyword), the class being extended is the parent class.
The parent class can be any class other than Object, and it can provide fields, methods, and constructors that the child class inherits.
If no parent class is explicitly defined, the class automatically inherits from the Object class
 */

class Animal {  // Parent class (Superclass)
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {  // Dog is the child class, Animal is the parent class
    void bark() {
        System.out.println("Barking...");
    }
}

//child class
/*
A child class (also called subclass) is any class that extends another class. It inherits fields and methods from the parent class, but can also add new methods or override inherited methods to change their behavior.
A child class can inherit from any class, but all child classes eventually inherit from the Object class through the inheritance chain.
 */
class Animals {  // Parent class
    void eat() {
        System.out.println("Eating...");
    }
}

class Dogs extends Animal {  // Child class
    void bark() {
        System.out.println("Barking...");
    }

    @Override
    void eat() {  // Overriding the method from the parent class
        System.out.println("Dog is eating...");
    }
}
public class object_parent_child_difference {
    public static void main(String[] args) {

        //object class instantation
        Myclass2 obj=new Myclass2();
        System.out.println(obj.print());
        System.out.println(obj.hashCode());// // toString() is inherited from Object
        System.out.println(obj.toString());

        //parent class instantation
        /*
        Key Point: The parent class provides common behavior or characteristics that the child class can inherit or override. The parent class can be any custom class, or if none is specified, it’s the Object class.
         */
        Dog dog=new Dog();
        dog.eat();//// Inherited from Animal (Parent class)
        dog.bark();// Defined in Dog class (Child class)

        /*
        3. Child Class (Subclass):
        A child class (also called subclass) is any class that extends another class. It inherits fields and methods from the parent class, but can also add new methods or override inherited methods to change their behavior.
        A child class can inherit from any class, but all child classes eventually inherit from the Object class through the inheritance chain.

         */

        //child class
        Dogs dogs = new Dogs();
        dogs.eat();  // Output: Dog is eating... (Overridden behavior)
        dogs.bark(); // Output: Barking...

    }
}
