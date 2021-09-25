package lesson16_IO_file_text.practice.demo_writeFile_readFile;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = null;
        try {
            students = FileUtils.readDataFromFile("sample\\A0421I1\\sample1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Student student: students) {
            System.out.println(student);
        }

        try {
            FileUtils.writeDataToFile("sample\\A0421I1\\sample2.txt", students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
