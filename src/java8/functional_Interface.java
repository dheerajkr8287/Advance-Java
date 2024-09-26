package java8;
/*
A functional interface cannot have zero abstract methods, as that would not allow it to be used in the functional programming paradigm Java supports.
a functional interface in Java must have exactly one abstract method. This is a key requirement for it to be used as the target for a lambda expression or method reference. However, it can also have default or static methods,
 which do not count as abstract methods
 */
@FunctionalInterface
interface ankit{
    public void m1();
    //override(default method:ye isilye use karte h kyoki agr default method ko override h to thik nhi toh kio baat nhi class mai jo implement karga
    default void print(){
        System.out.println("default method");
    }
    //no override(static methof:ye sirf interface ke liye hota h na ki jo class implement karga)
    static void dispaly(){
        System.out.println("static method");
    }
}

class Mythread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("job"+i);
        }
    }
}
public class functional_Interface implements ankit{
    @Override
    public void m1() {

    }


    public static void main(String[] args) {
        //lambda expression
        ankit i=()->{
            System.out.println("mai hu lambda wala");
        };
    ankit.dispaly();
    i.m1();//by calling lambda
       // Mythread mythread=new Mythread();
        Thread thread=new Thread(()->{
            for (int j = 0; j < 5; j++) {
                System.out.println("job"+j);
            }
        });
        thread.start();

    }


}
