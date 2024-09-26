package Mutithreading;

class demon extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Genie ashwani...");
        }
    }
}
public class threadName {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("dheeraj");
        System.out.println(Thread.currentThread().getName());

        Thread t1=new Thread();
        System.out.println(t1.getName());

        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());




    }
}
