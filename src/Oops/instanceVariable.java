package Oops;

/*
1:variable which are declare inside the class but outside the method is called instance variable
2:IF  we don't initalize instance varible ,it will be initilaize by default based on the datatype when the object is created
3:every object will maintain its own copy of instance variable
4:in static we cannot use instance variable directly (use with after making object)
5;each obj share seprates copy
6:when we create the only memory will be allocated for instance variable

 */

public class instanceVariable {
    int a=10;
    int b;
    public static void main(String[] args) {
        instanceVariable instance=new instanceVariable();
        System.out.println(instance.a);
        System.out.println(instance.b);
        instance.a=100;
        instance.b=900;
        System.out.println(instance.a);
        System.out.println(instance.b);

    }
    public void demo(){
        System.out.println(a);
    }
}
