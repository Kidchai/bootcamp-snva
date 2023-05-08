package IO.IOstreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("src\\IO\\testFiles\\testout.txt");
            while (fin.available() > 0) {
                System.out.print((char) fin.read());
            }
            fin.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
