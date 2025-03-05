package Generic.BoundedTypeParameter;

import java.security.PublicKey;

interface  Printable{
    void print();

}
class MyNumber extends Number implements Printable{

    private  final int value;

    MyNumber(int value) {
        this.value = value;
    }


    @Override
    public void print() {
        System.out.println("MyNumber:"+value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

//Bounded type parameter only extends both for class and interface
  class Boxx<T extends Number & Printable>{
    private T item;

    public Boxx(T item) {
        this.item = item;
    }
    public void display(){
        item.print();
    }

    public T getItem(){
        return item;
    }




  }
public class Test {
    public static void main(String[] args) {
        MyNumber myNumber=new MyNumber(232);
        Boxx<MyNumber> boxx=new Boxx<>(myNumber);
        boxx.display();
    }
}
