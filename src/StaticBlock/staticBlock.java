package StaticBlock;
/*
A static block (also called a static initializer) in Java is a block of code inside a class that runs automatically when the class is loaded into memory. It is mainly used for initializing static variables or executing one-time setup logic before the class is used. */
interface Test {
    static void display() {
        System.out.println("Hello from Interface Static Method");
    }
}
 class staticBlock {
//yaha par first static block code run hoga kyoko class load hote hi run hoyjayega bad main run hoga
/*
Executed automatically before main(): Static blocks run when the class is loaded, even before the main method.

Used for static variable initialization: It helps initialize static variables when an object is not yet created.

Runs only once: Since a class is loaded only once, the static block executes just once in a program.

Multiple static blocks execute in order: If there are multiple static blocks, they execute top to bottom in the order they appear
 */

    static int num;
    static String message;

    // Static block to initialize static variables
    static {
        num = 100;
        message = "Hello from static block!";
        System.out.println("Static block executed: num = " + num + ", message = " + message);
    }

    static {
        System.out.println("Static Block 1");
//        System.exit(0); // Exiting to prevent "main method not found" error
    }

    static {
        System.out.println("Static Block 2");
    }



    public static void main(String[] args) {
        System.out.println("Main method executed!");
        System.out.println("num = " + num);
        System.out.println("message = " + message);
        Test.display();
    }
}




//write  a java program without using main method hello world
/*

public class HelloWorld {
    static {
        System.out.println("Hello, World!");
        System.exit(0); // Exiting to prevent "main method not found" error
    }
}

 */


