package Oops;

class A{
    String city;
}

class  B extends A{
    String city;
    void print(){
        super.city="agra";//parent obj
        city="delhi";
        System.out.println("parent city="+super.city+","+"child city="+this.city);//current obj
    }
}
public class super_and_this_keyword {
    public static void main(String[] args) {
     B b=new B();
     b.print();
    }
}


/*
In Java, this and super are keywords used to refer to different contexts within a class.

this:

The this keyword is used to refer to the current instance of a class. It can be used in various ways:

Accessing Instance Variables:

java
Copy code
public class MyClass {
    int x;

    public void setX(int x) {
        this.x = x; // 'this.x' refers to the instance variable, 'x' refers to the parameter
    }
}

Calling Instance Methods:

java
Copy code
public class MyClass {
    public void display() {
        System.out.println("Hello");
    }

    public void show() {
        this.display(); // Calls the display method of the current instance
    }
}

Constructor Chaining:

java
Copy code
public class MyClass {
    int x;

    public MyClass() {
        this(10); // Calls the parameterized constructor
    }

    public MyClass(int x) {
        this.x = x;
    }
}



super
The super keyword is used to refer to the superclass (parent class) of the current object. It can be used in the following ways:

Accessing Superclass Variables:


public class Parent {
    int x = 10;
}

public class Child extends Parent {
    int x = 20;

    public void display() {
        System.out.println(super.x); // Refers to the variable 'x' in the Parent class
    }
}


Calling Superclass Methods:

java
Copy code
public class Parent {
    public void show() {
        System.out.println("Parent");
    }
}

public class Child extends Parent {
    public void show() {
        super.show(); // Calls the 'show' method of the Parent class
        System.out.println("Child");
    }
}



Calling Superclass Constructor:

java
Copy code
public class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
}

public class Child extends Parent {
    public Child() {
        super(); // Calls the constructor of the Parent class
        System.out.println("Child Constructor");
    }
}
In summary, this refers to the current instance of the class and helps distinguish between instance variables and method parameters or between methods in the same class. super, on the other hand, is used to access members (variables and methods) of the superclass, as well as to call the superclass constructor.








 */