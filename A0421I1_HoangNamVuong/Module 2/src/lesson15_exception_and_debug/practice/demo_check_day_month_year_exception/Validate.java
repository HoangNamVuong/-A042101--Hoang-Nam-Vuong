package lesson15_exception_and_debug.practice.demo_check_day_month_year_exception;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validate {
    public Date isCheckDate(String dateAsString) throws InvalidDateException{
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        dateFormat.setLenient(false);// 32/01/2021 => 01/02/2021
        Date date = null;
        boolean isInvalidFormat = true;
        try {
            date = dateFormat.parse(dateAsString);
            isInvalidFormat = false;
            dateFormat.setLenient(false);
            date = dateFormat.parse(dateAsString);
            Date now = new Date();
            if (date.after(now)) {
                throw new InvalidDateException("Ngay sinh khong the lon hon ngay hien tai.");
            }
        } catch (ParseException e) {
            if (isInvalidFormat) {
                throw new InvalidDateException("Ngay sai format. Format dung phai la dd/MM/yyyy");
            } else {
                throw new InvalidDateException("Ngay nhap vao khong ton tai. Vui long nhap vao ngay khac");
            }
        }
        return date;
    }

    public Date isCheckDate2(String dateAsString) throws InvalidDateException{
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);// 32/01/2021 => 01/02/2021
        Date date = null;
        boolean isInvalidFormat = true;
        try {
            date = dateFormat.parse(dateAsString);
            Date now = new Date();
            if (date.after(now)) {
                throw new InvalidDateException("Ngay sinh khong the lon hon ngay hien tai.");
            }
        } catch (ParseException e) {
            throw new InvalidDateException("Ngay sai format hoac ngay khong ton tai");
        }
        return date;
    }
}
