package Oops;

class Parent {

    String name;

    Parent(String n)
    {
        name=n;
    }

}

 class Child extends Parent{

    String name;

    Child(String n1,String n2) {
        super(n1);
        this.name=n2;
    }
    void print()
    {
        System.out.println(super.name+"  " +name);
    }


}

public class constructor2 {
    public static void main(String[] args) {
        Child child=new Child("Parent","Child");
        child.print();
    }
}


/*
In your code, the String name; is defined in both the Parent and Child classes. This creates a situation known as variable shadowing.

Here’s why you would use String name; in the Child class even though it already exists in the Parent class:

Variable Shadowing: In Java, if a variable with the same name is declared in both the parent and child classes, the variable in the child class shadows (or hides) the one in the parent class. This means that within the Child class, this.name refers to the name variable in the Child class, while super.name refers to the name variable in the Parent class.

Separate Variables: Declaring String name; in the Child class allows you to store a separate value in the Child class's name field, different from the one in the Parent class. The Child class can maintain its own value for name, while still having access to the Parent class's name through super.name.

Usage in the Example: In the Child class constructor, you initialize the Parent class’s name (with super(n1)) and the Child class’s name (with this.name = n2). When the print() method is called, you print both values: super.name (from the Parent class) and this.name (from the Child class).

Here's an example to clarify:

super.name refers to the name field in the Parent class.
this.name refers to the name field in the Child class.
In your code, this allows the print() method to output both "Parent Child", representing the names from both the parent and child classes.

If you did not declare String name in the Child class, the child instance would only have access to the name variable from the Parent class.
 */