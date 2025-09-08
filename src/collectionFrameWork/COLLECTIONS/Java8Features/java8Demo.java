package COLLECTIONS.Java8Features;
interface MathOperation{
    int operation(int a,int b);
}
public class java8Demo {
    public static void main(String[] args) {
        //java 8-- comes for minimal code ,functional programming
        //lambda expression,streams,Date and Time API,Default and static methods in interfaces
        //Optional class,Functional interfaces,Method references,Collectors API,Nashorn JavaScript


        //Lambda Expressions:
        //a lambda expression is a anonymous function which have (no name,no return type,no access modifier)
        //used to provide implementation of functional interface
        //syntax:
        //(parameters) -> expression or { statements }
        //A lambda expression is a short block of code that takes in parameters and returns a value.

        //It provides clear and concise syntax for implementing functional interfaces (SAM)

        Thread t=new Thread(new task());//without lambda
        Thread t1=new Thread(()-> System.out.println("Hello from lambda"));//with lambda

        MathOperation sumOperation=(a,b)->a+b;//lambda for sum
        System.out.println("Sum: "+sumOperation.operation(5, 10));
    }
}

 class task implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello");
    }
 }

 class sum implements MathOperation{
    @Override
    public int operation(int a, int b) {
        return a+b;
    }
 }


//Advantages of Lambda
//✅ Less boilerplate code
//✅ More readable & concise
//✅ Useful in Streams & Collections
//✅ Makes functional programming possible in Java