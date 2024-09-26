package Enum;

public enum TrafficLight {
    RED("Stop"),GREEN("go"),YELLOW("caution");


    private  final String action;

    TrafficLight(String action) {
        this.action = action;
    }

}
