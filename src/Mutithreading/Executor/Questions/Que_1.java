package Mutithreading.Executor.Questions;
/*
 Write a program that creates a single-threaded executor service.
Define and submit a simple Runnable task that prints numbers
from 1 to 10. After submission, shut down the executor.
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class hello implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }
    }
}
public class Que_1 {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            hello h1 = new hello();
            service.submit(h1);
            service.shutdown();
        }
    }
}
