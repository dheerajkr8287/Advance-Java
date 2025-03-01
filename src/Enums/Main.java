package Enums;

public class Main {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.GREEN;
        color=TrafficLight.YELLOW;
        System.out.println(color);

        String action = color.getAction();
        System.out.println(action);//catuion
        //name(): Returns the exact name of the enum constant as a String.
        System.out.println("Enum name:"+color.name());
//        ordinal(): Returns the index of the enum constant (starting from 0).
        System.out.println("Enum Ordinal:"+color.ordinal());


        Grade grade = Grade.A;

        //String constant to enum convert
        Grade j = Grade.valueOf("B");
        System.out.println(j);

        //value() :used for Iterate(Returns an array of all enum constants.)
        for (Grade value : Grade.values()) {
            System.out.print(value+" ");
        }

    }
}
