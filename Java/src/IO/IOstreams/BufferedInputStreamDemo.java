package IO.IOstreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try {
            BufferedInputStream bin = new BufferedInputStream(new FileInputStream("src\\IO\\testFiles\\testout.txt"));
            while (bin.available() > 0) {
                System.out.print((char) bin.read());
            }
            bin.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
