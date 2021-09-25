package lesson16_IO_file_text.exercise.copy_file_text;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        copy();
    }
    public static void copy() throws IOException {
        File source = new File("src/lesson16_IO_file_text/exercise/copy_file_text/text1.txt");
        File dest = new File("src/lesson16_IO_file_text/exercise/copy_file_text/text2.txt");

        FileChannel sc = null;
        FileChannel dc = null;

        try {

            sc = new FileInputStream(source).getChannel();
            dc = new FileOutputStream(dest).getChannel();
            dc.transferFrom(sc, 0, sc.size());

            sc.close();
            dc.close();

        } finally {

            if (sc != null) {
                sc.close();
            }

            if (dc != null) {
                dc.close();
            }
        }
    }


}
