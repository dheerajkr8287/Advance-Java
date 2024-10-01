package Mutithreading.RunnableInterface;
class Deno implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Jai Shri Ram...");
        }
    }
}
public class thread_using_runnableInterface {
    public static void main(String[] args) {

        Deno bullet=new Deno();
        Thread gun=new Thread(bullet);
        gun.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("Main");
        }
    }
}
