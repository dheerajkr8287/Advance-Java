package exception_handling;

public class mutipleCatch_finally {
    public static void main(String[] args) {
        System.out.println("main method");
        try{
            System.out.println("inside try");
            System.out.println(10/0);
        } catch (ArithmeticException e)//child
        {
            System.out.println("ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");

        } catch (Exception e) {   //exception are parent
            System.out.println("Exception");

        }
        finally {
            System.out.println("mai to chaluga");
        }
    }
}
