package lesson16_IO_file_text.practice.demo_writeFile_readFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static final String COMMA = ",";

    public static List<Student> readDataFromFile(String path) throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(path)));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                String[] data = line.split(COMMA);
                String id = data[0];
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                String address = data[3];
                students.add(new Student(id, name, age, address));
            }
        } finally {
            bufferedReader.close();
        }

        return students;
    }

    public static void writeDataToFile(String path, List<Student> students) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student: students) {
                bufferedWriter.write(student.fomatToFile());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } finally {
            bufferedWriter.close();
        }
    }
}
