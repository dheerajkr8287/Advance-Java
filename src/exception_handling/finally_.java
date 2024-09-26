package exception_handling;

public class finally_ {
    public static void main(String[] args) {

        System.out.println(print());
    }

    public static int print()
    {

        try {
            //System.exit(0);//jvm shutdown finally not run
            System.out.println(10/0);

            return 100;
        }
        catch (ArithmeticException e)
        {
            return 778;//here overridden  of return
        }
        finally {
            return 222;
        }
    }
}

/*
Why Not 778?
The catch block returns 778 when an ArithmeticException is caught,
 but this return value is overridden by the finally block’s return value.
 The finally block executes after the catch block,
 and its return statement will replace any return value from the catch block.
 */