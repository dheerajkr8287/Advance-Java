package Mutithreading.Question;
/*
Create three threads. Ensure that the second thread starts only after
the first thread ends and the third thread starts only after the second
thread ends using the join method. Each thread should print its start
and end along with its name.
 */

class  hello extends Thread{
    private  final int X;

    public hello(int x){
        this.X=x;

    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println("Hello from Thread :"+X);

        }
    }
}

public class Ques_3 {
    public static void main(String[] args) throws InterruptedException {
        hello t1=new hello(1);
        hello t2=new hello(2);
        hello t3=new hello(3);

        System.out.printf("\ncreate a thread %s\n",t1.getState()+"t1");
        t1.start();

        t1.join();
        System.out.printf("\nthread finished %s\n",t1.getState()+"t1");

        System.out.printf("\ncreate a thread %s\n",t2.getState()+"t2");
        t2.start();

        t2.join();
        System.out.printf("\nthread finished %s\n",t2.getState()+"t2");

        System.out.printf("\ncreate a thread %s\n",t3.getState()+"t3");
        t3.start();
        t3.join();
        System.out.printf("\nthread finished %s\n",t3.getState()+"t3");






    }
}
