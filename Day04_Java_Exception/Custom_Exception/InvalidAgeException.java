package Day04_Java_Exception.Custom_Exception;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}
