package exception_handling;

import java.util.Scanner;
class myException extends Exception{
    public myException(String message){
        super(message);
    }
}
public class customException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        try{
            int age=sc.nextInt();
            if(age>100){
//                throw new myException("My error is this");
                throw new ArithmeticException();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
