package exception_handling;
/*
1:throws is used to declare that a method might throw certain types of exceptions. It is a way to tell the caller of the method that they need to handle or declare these exceptions
2:You use throws when a method can potentially throw a checked exception (an exception that the compiler requires you to handle). This is a way to pass the responsibility of handling the exception to the caller of the method.
3:public returnType methodName() throws ExceptionType1, ExceptionType2 {
    // method body
}

 */

public class throws_ {
    public static void m1() throws InterruptedException {
        System.out.println("m1");

        m2();
    }
    public static void m2() throws InterruptedException {
        System.out.println("m2");
        m3();
    }
    public static void m3 () throws InterruptedException {
        System.out.println("m3");

        Thread.sleep(3000);
        System.out.println("main hu m3");
        System.out.println("Genie Ashwani");
    }
    public static void main(String[] args) throws InterruptedException{

        System.out.println("main");

        m1();

    }
}
