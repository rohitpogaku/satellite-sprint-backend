package exceptionPackage;

public class EmailNotFoundException extends Exception {
    public EmailNotFoundException(String message) {
        super(message);
    }
}
