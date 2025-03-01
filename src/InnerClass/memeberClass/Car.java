package InnerClass.memeberClass;

public class Car {
    //member



    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn=false;
    }
//inner member class is associated with instance of outer class instance
    class  Engine{
        void start(){
            if(!isEngineOn){
                isEngineOn=true;
                System.out.println(model+"engine started");
            }else{
                System.out.println(model+"engine is already on");
            }
        }

        void stop(){
            if(isEngineOn){
                isEngineOn=false;
                System.out.println(model+"engine stopped");
            }else{
                System.out.println(model+"engine is already stopped");
            }
        }
    }
}
