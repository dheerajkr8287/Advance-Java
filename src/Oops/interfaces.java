package Oops;
interface vechicleInterface{
    public int calculateSpeed();//public ,Abstract
    int a=10; //public static final
}
class truck implements vechicleInterface{
    @Override
    public int calculateSpeed(){
        return  80;
    }
}
class  Bus implements vechicleInterface{
    @Override
    public int calculateSpeed(){
        return  90;
    }
}

class  sportBike implements vechicleInterface{
    @Override
    public int calculateSpeed(){
        return  120;
    }
}

public class interfaces {
    public static void main(String[] args) {
        vechicleInterface sb=new sportBike();
        vechicleInterface bus=new Bus();
        vechicleInterface truck=new truck();
        System.out.println("speed of sportbike:"+sb.calculateSpeed());
        System.out.println("speed of bus:"+bus.calculateSpeed());
        System.out.println("speed of truck:"+truck.calculateSpeed());
    }
}
