package exception_handling;
/*
1:throw is used to manually trigger an exception in Java.
2:throw is used to explicitly throw an exception. It is a fundamental mechanism for error handling in the language.
3:When you use throw, you are creating an instance of an Exception (or a subclass) and passing it to the runtime system.
4:throw new ExceptionType("Error message");

 */
public class throw_ {
    public static void m1(){
        try{
            throw new ArithmeticException("divide by 0");
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args) {
        m1();
    }
}
