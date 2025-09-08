package COLLECTIONS.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceAndConstructorReference {
    public static void main(String[] args) {
        //Method Reference
        //A method reference is a shorthand notation of a lambda expression to call a method.
        //It is used to refer to a method without executing it.
        //use method without invoking & in place of lambda expression
        //It is used when a lambda expression just calls an existing method.
        // :: is the method reference operator
//A constructor reference is a shorthand for creating objects using ::new.
//It works when a lambda expression just calls a constructor.

        List<String > names=List.of("Amit","Raju","Sita","Gita" );
        //Lambda expression
        names.forEach(name-> System.out.println(name));
        //Method Reference
        names.forEach(System.out::println); //prints each name






        //Constructor Reference
        //A constructor reference is a shorthand notation of a lambda expression to call a constructor.
        //It is used to refer to a constructor without executing it.
        //use constructor without invoking & in place of lambda expression
        //It is used when a lambda expression just calls a constructor to create a new object.
        // :: is the method reference operator

        List<String > mobilePhoneNames= Arrays.asList("iPhone","Samsung","OnePlus" );
        //Lambda expression
//        mobilePhoneNames.stream().map(x->new MobilePhone(x)).collect(Collectors.toList());
        //Constructor Reference
        List<MobilePhone> collect = mobilePhoneNames.stream().map(MobilePhone::new).collect(Collectors.toList());

        System.out.println(collect);

    }
}

class MobilePhone{
    String name;
    public MobilePhone(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "name='" + name + '\'' +
                '}';
    }
}
