package AcessModifiers.check;
/*
1.Same Package: Within the same package, protected members (variables, methods, constructors) can be accessed by any class, just like public members.

2.Different Package: In a different package, protected members can only be accessed by subclasses of the class where the member is defined. The subclass must either:

3.Directly Access the Protected Member: From within the subclass, but only via inheritance (i.e., through the object of the subclass itself, not via an object of the superclass).
Via an Instance of the Subclass: The subclass can access the protected members of its superclass but cannot access the protected members of a different object of the superclass.
 */
import AcessModifiers.protectedExample;

public class proctedExCheck extends protectedExample {
    public void m1(){
        int a=demo;
        display();  //non static donot acess in static
    }
    public static void main(String[] args) {
        proctedExCheck e=new proctedExCheck();
        e.m1();// Accessing via subclass (allowed)

        /*
        In the same package (e.g., packageA), protected members can be accessed by any class.
        In a different package (e.g., packageB), protected members can only be accessed by subclasses, as shown in SubClass.
        Summary:
Within the same package, protected behaves like public.
Across packages, protected members are accessible only to subclasses, and only through inheritance, not through objects of the superclass.
         */


        // The following line would produce an error:
        //protectedExample r=new protectedExample();
       // r.display();//// ERROR: Can't access protected method from outside
    }
}
