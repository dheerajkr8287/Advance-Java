package Mutithreading;
class printMsg{
    public synchronized void m1(){
        for(int i=0;i<5;i++){
            //synchronixed ke andar at time ek thread ayega to lock hoga
            synchronized (this) {   //this -->for current obj
                System.out.println("exceuted by..." + Thread.currentThread().getName());
                System.out.println("hello ashwani....");
            }
            try{
                Thread.sleep(100);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Bye ashwani.."+Thread.currentThread().getName());
        }
    }
}
class synThreadDemo extends Thread{
    printMsg p;
    synThreadDemo(printMsg p){
        this.p=p;
    }

    @Override
    public void run() {
        p.m1();
    }
}
public class synchronization {
    public static void main(String[] args) {
        printMsg p=new printMsg();
        synThreadDemo t1=new synThreadDemo(p);
        synThreadDemo t2=new synThreadDemo(p);
        t1.setName("ye hai T1");
        t2.setName("ye hai T2");
        t1.start();
        t2.start();
    }
}
