package library.exception;

public class WrongKeycodeException extends Exception{

    @Override
    public String getMessage() {
        return "Your keycode is invalid";
    }
}
