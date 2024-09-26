package Oops;


abstract class Vehicle{
    int a;
    public abstract void engine();

    public void print()
    {
        System.out.println("hello");
    }

    Vehicle()
    {
        System.out.println("i am super constructor");
    }
}

public class abstractClass extends Vehicle{

    @Override
    public void engine() {
        System.out.println("Car Engine");
    }

    public static void main(String[] args) {
        Vehicle v=new abstractClass();
        v.engine();
        System.out.println(v.a);
    }
}