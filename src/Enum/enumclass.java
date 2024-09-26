package Enum;
/*
1:enum is class:, an enum (short for enumeration) is a special data type that represents a fixed set of constants.
It is commonly used to define a collection of related values, such as days of the week, months, directions, etc.
2:enum in java is special types for fixed sets of constant like days,color
3:Access:Access constant with dot syntax eg=Color.RED
4:features:type safe,readable can be methods and fields
5:usage:useful in switch statement and iterating with value() method
 */
public class enumclass {


    public static void main(String[] args) {
        TrafficLight light=TrafficLight.RED;
//        light=TrafficLight.GREEN;
        System.out.println("Traffic color is"+light);


        //using enum in switch case
        switch(light){
            case RED :
                System.out.println("people have to stop");
                break;
            case GREEN:
                System.out.println("people have to go");
                break;
            case YELLOW:
                System.out.println("people be ready");
            default:
                System.out.println("keep going");
                break;
        }


        Grade grade=Grade.valueOf("C");
        grade=Grade.B;
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }

    }
}



/*
Features of enum:
Type Safety: enum provides compile-time type checking. You can't assign any value to an enum that isn't predefined.
Switch Support: Enums work perfectly with switch statements, making code more readable.
Methods and Constructors: Enums can have fields, methods, and constructors just like regular classes.
 */