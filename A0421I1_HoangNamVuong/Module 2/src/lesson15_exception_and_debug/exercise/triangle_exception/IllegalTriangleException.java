package lesson15_exception_and_debug.exercise.triangle_exception;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }

}
