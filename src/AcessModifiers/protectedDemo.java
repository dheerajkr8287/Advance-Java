package AcessModifiers;
class MyProtected {
    protected int a=333;
    protected void display(){
        System.out.println("mai hu protected");
    }
}
public class protectedDemo {
    public static void main(String[] args) {
        MyProtected p=new MyProtected();
        System.out.println(p.a);
        p.display();
    }
}
