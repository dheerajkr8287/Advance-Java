package Enums;

public class EnumSwitchExample {
    public static void main(String[] args) {
        TrafficLight green = TrafficLight.GREEN;

        switch (green){
            case RED:
                System.out.println("STOP");
                break;
            case YELLOW:
                System.out.println("Caution");
                break;
            case GREEN:
                System.out.println("GO");
                break;

            default:
                System.out.println("DO Anything");
                break;
        }
    }
}
