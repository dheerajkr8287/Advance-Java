package Mutithreading;
//* A daemon thread is a low-priority thread that runs in the background to perform tasks
// such as garbage collection or provide services to user threads.
// Daemon threads are low-priority threads whose only role is to provide
// services to user threads.

/*

In Java, a daemon thread is a type of thread that runs in the background and is used for tasks that are not critical to the application's main functionality. These threads are typically used for background services such as garbage collection, monitoring, or other housekeeping tasks.
 */
class ThreadDemo4 extends Thread{
    int sum=0;

    @Override
    public void run() {
        synchronized (this){ //this-->current obj
            System.out.println("child thread start sum:");
            for(int i=0;i<100;i++){
                sum+=i;
            }
            System.out.println("child thread giving notifiaction");
            this.notify();
        }
    }
}
public class InterThreadDemo {
    public static void main(String[] args) throws InterruptedException {

ThreadDemo4 t1=new ThreadDemo4();
t1.start();
synchronized (t1){
    System.out.println("main thread is waiting for t1");
    t1.wait();
    System.out.println("main thread get notification");
    System.out.println(t1.sum);

}
    }
}
