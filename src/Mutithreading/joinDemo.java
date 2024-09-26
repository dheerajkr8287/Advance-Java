package Mutithreading;
class  demoThread2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("child thread starting...");
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class joinDemo {
    public static void main(String[] args) throws InterruptedException {
 demoThread2 t1=new demoThread2();
 t1.start();
 /*
 In Java, the join() method is used to pause the execution of the current thread until another thread has finished its execution. This is particularly useful when you want to ensure that one thread completes before the next thread continues.


  */
 t1.join();//exceuted by main thread
 //ya toh mai yaha par join mai jo unhandled checked exception h usee try-catch se handled karlu ya mai use throws se deliget kar du default exception handler ko
        // try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        for(int i=0;i<5;i++){
            System.out.println("main thread");
        }
    }
}
