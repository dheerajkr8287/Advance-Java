package MathClass;
/*
Key Methods:
1. abs(): Absolute value.
2. ceil(): Rounds up.
3. floor(): Rounds down.
4. round(): Rounds to nearest integer.
5. max(), min(): Maximum and minimum of two numbers.
6. pow(): Power calculation.
7. sqrt(): Square root.
8. random(): Random number generation.
9. exp(), log(): Exponential and logarithmic function
1. Static Class: Math methods are static and
accessed directly.
2.Constants: Includes PI and E for π and the base
of natural logarithms.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(Math.abs(-33));
        System.out.println(Math.ceil(4.33));
        System.out.println(Math.floor(4.33));
        System.out.println(Math.round(4.33));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.random());
        System.out.println(Math.PI);
    }
}
