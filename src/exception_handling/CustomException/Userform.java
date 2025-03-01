package CustomException;
//unchecked

class InvalidInputException extends RuntimeException{
    public InvalidInputException(String message) {
        super(message);
    }
}
public class Userform {
    public static void validateForm(String name){
        if(!name.matches("[a-zA-Z]+")){
            throw new InvalidInputException("Invalid name! Only letters are allowed.");

        }
        System.out.println("Name Accepted:"+name);


    }

    public static void main(String[] args) {
        try{
            validateForm("2323");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            System.out.println("Error: " + e.getMessage()); // Handle gracefully
        }
    }
}
