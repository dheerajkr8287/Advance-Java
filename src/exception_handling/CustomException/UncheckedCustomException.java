package CustomException;


//Why Doesn't This Program Use try-catch or throws?
//Your program throws an unchecked exception (InvalidAgeException), but it does not handle it explicitly using try-catch or declare it with throws.
//
//🚀 Java does not force handling of unchecked exceptions (RuntimeException and its subclasses), which is why this code compiles and runs until it encounters an exception at runtime.

//Why Not Use throws?
//Declaring an exception with throws (throws InvalidAgeException) is not required for unchecked exceptions because Java assumes that the developer will either:
//Fix the issue in code (e.g., by validating user input before calling the method).
//Handle the exception explicitly if needed.



//How to Handle It Using try-catch (Optional)
//If you want to handle the exception and prevent the program from crashing, use a try-catch block:






// Custom Unchecked Exception
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Age Validator Class
class AgeValidator {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        }
        System.out.println("Valid age for registration.");
    }
}

// Main Class
public class UncheckedCustomException {
    public static void main(String[] args) {
//        AgeValidator.checkAge(16); // This will throw an exception






//How to Handle It Using try-catch (Optional)
//If you want to handle the exception and prevent the program from crashing, use a try-catch block:





        try {
            AgeValidator.checkAge(16); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage()); // Handle the error
        }
        System.out.println("Program continues..."); // Program won't terminate
    }
}

