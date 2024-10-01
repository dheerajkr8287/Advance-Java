package Mutithreading.Question;
/*
. Write a program that creates two threads. Each thread should print
"Hello from Thread X", where X is the number of the thread (1 or 2),
ten times, then terminate.
 */

class helloThread extends Thread{
    private final int X;

    public helloThread(int x) {
        X = x;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nfrom inside run %s",Thread.currentThread().getState());

            System.out.println("Hello from Thread :"+X);
        }
    }
}


public class Ques_1 {
    public static void main(String[] args) {
        helloThread t1=new helloThread(1);
        helloThread t2=new helloThread(2);

        t1.start();
        t2.start();

    }





}
