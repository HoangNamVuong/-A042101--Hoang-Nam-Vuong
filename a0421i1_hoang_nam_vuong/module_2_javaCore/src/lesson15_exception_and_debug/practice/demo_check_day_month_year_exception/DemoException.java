package lesson15_exception_and_debug.practice.demo_check_day_month_year_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoException {
    public static void main(String[] args) {
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter("pathName");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        BufferedWriter bufferedWriter = new BufferedWriter(writer);\
//        int a = 4;
//        int b = 0;
//        try {
//            System.out.println("Result: " + a / b);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        int[] arr = {1, 4, 3, 10, 4, 5};
        try {
            System.out.println(arr[6]);
            System.out.println("Hello");
            FileWriter file = new FileWriter("D:\\sample.txt");
            throw new IndexOutOfBoundsException("Error index");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");

        } catch (IOException e) {
            System.out.println("IOException");

        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done");
        }

        System.out.println("finish");
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("");

    }
}
