package Mutithreading;
class myDemoThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            //yeild is used to give up cpu temporary
            //This method gives the scheduler a hint that the thread is ready to pause and allow other threads of the same priority to execute.
            Thread.yield();
//            System.out.println("child Thread job ..."+i);//some chance have give other thread

            try {
                //sleep ko try/catch se handled karna padta hai
                /*
                In Java, the sleep() method is used to pause the execution of the current thread for a specified amount of time. During this time, the thread goes into a "sleeping" state and doesn't consume CPU resources. After the sleep duration, the thread becomes runnable again and continues executing when the CPU is available.
                 */
                sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();

            }
            System.out.println("child Thread job ..."+i);//due to sleep() they are not excute first


        }
    }
}
public class yeildAndSleep {
    public static void main(String[] args) {

        myDemoThread t1=new myDemoThread();
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread..."+i);
        }

    }
}
