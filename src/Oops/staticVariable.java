package Oops;
//static varible ko uske class name se bhi access kar skate h
//static varible ko kahi bhi use kar sakte h class ke andar bahar sab

/*
In Java, static methods belong to the class itself rather than to instances
 of the class. This means that static methods can be called without
 creating an instance of the class. Non-static methods, on the other hand,
  belong to instances of the class and require an instance of the class to
   be invoked.


 */
public class staticVariable {
    static int a=10;
    public static void main(String[] args) {
        staticVariable obj=new staticVariable();
        System.out.println(obj.a);//10

        obj.a=100;
        System.out.println(obj.a);//100

        staticVariable obj1=new staticVariable();
        obj1.a=333;
        System.out.println(obj1.a);//333
        System.out.println(obj.a);//333   here each object share same copy
    }
    public void demo(){
        System.out.println(staticVariable.a);

    }
}
