package Mutithreading.SynchronizeKeyword;

public class Counter {
    private int count=0;
    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}


 class UpdateThread extends Thread{
     private  final Counter counter;

     public UpdateThread(Counter counter) {
         this.counter = counter;
     }

     @Override
     public void run() {
         for (int i = 0; i < 10000; i++) {
             counter.increment();
         }
     }
 }


 class  TestSynchronize{

     public static void main(String[] args) {
         long startTime=System.currentTimeMillis();
         Counter counter=new Counter();
         UpdateThread t1=new UpdateThread(counter);
         UpdateThread t2=new UpdateThread(counter);


         try {
             t1.start();
             t2.start();
             t1.join();
             t2.join();
         } catch (InterruptedException e) {
             System.out.println("Thread Interupted :"+e.getMessage());
         }

         long endTime=System.currentTimeMillis();
         System.out.printf("Final counter value:%d and"+"time taken:%d",counter.getCount(),(endTime-startTime));

     }

 }

