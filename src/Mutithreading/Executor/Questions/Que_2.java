package Mutithreading.Executor.Questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
. Create a fixed thread pool with a specified number of threads
using Executors.newFixedThreadPool(int). Submit multiple tasks
to this executor, where each task should print the current thread's
name and sleep for a random time between 1 and 5 seconds.
Finally, shut down the executor and handle proper termination
using awaitTermination
 */
class SleepTask implements Runnable{
    @Override
    public void run() {
        Thread current=Thread.currentThread();
        System.out.printf("Started with Thread:%s\n",current.getName());
        try {
            Thread.sleep(getRandom()*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("End with Thread:%s\n",current.getName());

    }

    private int getRandom(){
        double random=Math.random()*5+1;
        return (int) random;
    }
}
public class Que_2 {
    public static void main(String[] args) throws InterruptedException {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            for (int i = 0; i < 10; i++) {
                SleepTask task = new SleepTask();
                service.submit(task);


            }
            service.shutdown();
            System.out.println("*****************1");
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("EMERGENCY SHUTDOWN");
                service.shutdownNow();
            }
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
