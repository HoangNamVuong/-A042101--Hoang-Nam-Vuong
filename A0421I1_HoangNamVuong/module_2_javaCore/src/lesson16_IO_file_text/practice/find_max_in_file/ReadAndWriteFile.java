package lesson16_IO_file_text.practice.find_max_in_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/lesson16_IO_file_text/practice/sum_in_file_text/file.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src/lesson16_IO_file_text/practice/sum_in_file_text/file.txt",maxValue);
    }

    public static List<Integer> readFile(String path) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public void writeFile(String path, int max) {
        try {
            FileWriter writer = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("max is: " + max);
            bufferedWriter.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
