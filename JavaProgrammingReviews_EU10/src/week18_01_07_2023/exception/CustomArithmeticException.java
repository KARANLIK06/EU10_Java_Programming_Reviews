package week18_01_07_2023.exception;

public class CustomArithmeticException extends RuntimeException{

    //for mac command+N
    //for windows Alt+insert
    public CustomArithmeticException() {
        super("You have an error with divide with 0");
    }

    public CustomArithmeticException(String message) {
        super(message);
    }
}
