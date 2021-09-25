package lesson17_IO_file_Binary_and_serialization.practice.demo_binary_file;

import java.io.*;

public class BinaryFileDemo {
    public static void main(String[] args) {
//        writeFile("sample\\A0421I1\\sample1.dat");
        readFile("sample\\A0421I1\\sample1.dat");
    }

    public static void writeFile(String path) {
        int a = 5;
        boolean b = false;
        String c = "Hello world"; // => 73 => 101010101
        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            dataOutputStream.writeInt(a);
            dataOutputStream.writeBoolean(b);
            dataOutputStream.writeChars(c);

            dataOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String path) {
        int a = 0;
        boolean b = true;
        String c = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            a = dataInputStream.readInt();
            b = dataInputStream.readBoolean();
            c = dataInputStream.readUTF();
            dataInputStream.close();
        } catch (EOFException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
