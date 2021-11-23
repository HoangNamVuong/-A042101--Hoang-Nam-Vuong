package lesson16_IO_file_text.practice.sum_in_file_text;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
       readFileText("src/lesson16_IO_file_text/practice/sum_in_file_text/file.txt");
    }

    public static void readFileText(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("sum = " + sum);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
