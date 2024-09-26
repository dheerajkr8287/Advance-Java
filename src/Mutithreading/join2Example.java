package Mutithreading;
class DemoThread3 extends  Thread{
    Thread t1;
    DemoThread3(Thread t1){
        this.t1=t1;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                t1.join();//excuted by demoThread3
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("DemoThread3 thread starting...");
        }
    }
}
class DemoThread2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("child Thread starting ...");
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class join2Example {
    public static void main(String[] args) throws InterruptedException{
        demoThread2 t1=new demoThread2();
        DemoThread3 t2=new DemoThread3(t1);
        t1.start();
        t2.start();
        t2.join(); //excuted by main thread
//        t2.interrupt();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Main Thread");
        }
    }
}
