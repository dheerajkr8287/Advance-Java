package Mutithreading;
class Demo extends Thread{
    @Override
    public void run() {
       // thread job
        for (int i = 0; i < 10; i++) {
            System.out.println("Jai Shri Ram...");
        }
    }
}
public class thread_using_extends {
    public static void main(String[] args) {
 Demo d=new Demo();//Instantation of thread
 d.start();//thread start

        for (int i = 0; i < 10; i++) {
            System.out.println("Main");
        }
    }
}
