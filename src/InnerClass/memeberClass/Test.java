package InnerClass.memeberClass;

public class Test {
    public static void main(String[] args) {
        Car car=new Car("fortune");
        Car.Engine engine=car.new Engine();
        engine.start();
        engine.stop();
    }
}
