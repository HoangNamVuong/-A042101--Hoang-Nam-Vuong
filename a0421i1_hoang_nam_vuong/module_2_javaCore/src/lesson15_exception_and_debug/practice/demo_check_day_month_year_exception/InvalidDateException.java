package lesson15_exception_and_debug.practice.demo_check_day_month_year_exception;

public class InvalidDateException extends Exception{
    public InvalidDateException() {
    }

    public InvalidDateException(String msg) {
        super(msg);
    }
}
