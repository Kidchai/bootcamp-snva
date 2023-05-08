package IO.IOstreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("src\\IO\\testFiles\\testout.txt");

            fout.write(65); //A

            String line = "\nThis is file #1. Written using FileOutputStream class";
            byte[] bytes = line.getBytes();
            fout.write(bytes);

            fout.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Successfully written to file");
    }
}
