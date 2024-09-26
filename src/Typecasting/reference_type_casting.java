package Typecasting;
class parent{
    void display(){
        System.out.println("this is parent class");
    }
}
class child extends parent{
    void display(){
        System.out.println("this is child class");
    }
}

public class reference_type_casting {
    public static void main(String[] args) {
        parent p=new parent();
        p.display();

        //upcasting
        p=(parent) new child();
        p.display();

        //downcasting
        child c=(child) p;
        c.display();
    }
}
