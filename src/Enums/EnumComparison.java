package Enums;
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class EnumComparison {
    public static void main(String[] args) {
        Day d1 = Day.MONDAY;
        Day d2 = Day.MONDAY;
        Day d3 = Day.FRIDAY;

        System.out.println(d1 == d2); // true (Both refer to the same MONDAY instance)
        System.out.println(d1 == d3); // false (MONDAY and FRIDAY are different instances)
        System.out.println(d1.equals(d2)); // true (Same enum value)
        System.out.println(d1.equals(d3)); // false (Different enum values)
    }
}


//Why d1 == d2 is true in Java Enums?
//In Java, enums are singleton-like, meaning each constant is a single shared instance. This is why d1 == d2 evaluates to true, even though == normally compares references.

//Key Reason: Enum Constants Are Singleton
//When you declare an enum:



//enum Day {
//    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
//}
//Java internally ensures that every enum constant (e.g., MONDAY) is a single instance across the program. So, when you do:


//Day d1 = Day.MONDAY;
//Day d2 = Day.MONDAY;
//Both d1 and d2 point to the same instance of MONDAY. That’s why:

//System.out.println(d1 == d2);  // true  (Same reference)
//System.out.println(d1.equals(d2));  // true  (Same value)