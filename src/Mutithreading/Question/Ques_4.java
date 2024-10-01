package Mutithreading.Question;
/*
. Simulate a traffic signal using threads. Create three threads
representing three signals: RED, YELLOW, and GREEN. Each signal
should be on for a certain time, then switch to the next signal in order.
Use sleep for timing and synchronize to make sure only one signal is
active at a time.
 */
enum  TrafficColor{
    RED(9000),YELLOW(1000),GREEN(3000);

    private  int OnTimeMills;
    TrafficColor(int onTimeMills) {
        OnTimeMills = onTimeMills;
    }

    public int getOnTimeMills() {
        return OnTimeMills;
    }
}
class trafficLight extends Thread{
    private  final TrafficColor color;

    public trafficLight(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n",color);
        try {
            Thread.sleep(color.getOnTimeMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s INactive\n",color);

    }
}


public class Ques_4 {

    public static void main(String[] args) throws InterruptedException {
        trafficLight red=new trafficLight(TrafficColor.RED);
        trafficLight yellow=new trafficLight(TrafficColor.YELLOW);
        trafficLight Green=new trafficLight(TrafficColor.GREEN);

        Green.start();
        Green.join();
        yellow.start();
        yellow.join();
        red.start();


    }
}
