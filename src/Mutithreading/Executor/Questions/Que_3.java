package Mutithreading.Executor.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/*
 Write a program that uses an executor service to execute multiple
Callable tasks. Each task should calculate and return the factorial
of a number provided to it. Use Future objects to receive the
results of the calculations. After all tasks are submitted, retrieve
the results from the futures, print them, and ensure the executor
service is shut down correctly.

 */
class Factorial implements Callable<Integer>{
    private  final int number;
    public Factorial(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        if (number < 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
    return result;
    }
}
public class Que_3 {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(1)) {
            List<Future<Integer>> list=new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                Factorial task=new Factorial(i);
                list.add(service.submit(task));

            }
            for (Future<Integer> future : list) {
                System.out.printf("\n Result is %d",future.get());
                
            }
            service.shutdown();
            if(!service.awaitTermination(5,TimeUnit.SECONDS)){
                System.out.println("Emergency please");
                service.shutdownNow();
            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
