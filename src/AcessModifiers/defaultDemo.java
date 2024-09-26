package AcessModifiers;

class MyDefault{
    int a=100;
    void print(){
        System.out.println("Dheeraj");
    }
}
public class defaultDemo {
    public static void main(String[] args) {
      MyDefault myDefault=new MyDefault();
        System.out.println(myDefault.a);
        myDefault.print();
    }
}
