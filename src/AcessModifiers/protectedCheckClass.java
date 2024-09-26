package AcessModifiers;
//here procted are acess in same package with subclass
public class protectedCheckClass extends MyProtected {
    public static void main(String[] args) {
        MyProtected p=new MyProtected();
        System.out.println(p.a);
        p.display();
    }
}
