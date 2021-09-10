package lesson16_input_output_text_file.practice.demo_writeFile_readFile;

import java.io.*;

public class WriteFileDemo {
    public static void main(String[] args) throws IOException {
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter("sample\\A0421I1\\sample1.txt");
//            writer.write("hello world\n");
//            float a = 4 / 0;
//            writer.write(new Date().toString());
//            writer.write("\n");
//        } finally {
//            writer.close();
//        }
//        System.out.println("Finish");
        String [] str = {"Nam", "Thang", "Hai", "Hung", "Nghia"};
//        writeFile(str);
        readFile("sample\\A0421I1\\sample1.txt");
    }

    public static void writeFile(String[] data) throws IOException {
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            writer = new FileWriter("sample\\A0421I1\\sample1.txt");
            bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i < data.length; i++) {
                bufferedWriter.write("line " + (i + 1) + ": ");
                if (i == 2) {
                    int a = 4/0;
                }
                bufferedWriter.write(data[i]);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } finally {
            bufferedWriter.close();
            writer.close();
        }
        System.out.println("Finish");
    }

    public static void readFile(String path) throws IOException {
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(new File(path));
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            bufferedReader.close();
            reader.close();
        }
    }
}
