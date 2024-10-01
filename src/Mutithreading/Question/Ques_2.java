package Mutithreading.Question;
/*
Write a program that starts a thread and prints its state after each
significant event (creation, starting, and termination). Use
Thread.sleep() to simulate long-running tasks and Thread.getState() to
print the thread's state.
 */
class ThreadState extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("\nfrom inside run %s",getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Ques_2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1=new ThreadState();
        System.out.printf("\ncreate a thread %s",t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\nthread finished %s",t1.getState());



    }
}
