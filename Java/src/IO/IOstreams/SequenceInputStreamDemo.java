package IO.IOstreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fin1 = new FileInputStream("src\\IO\\testFiles\\testout.txt");
            FileInputStream fin2 = new FileInputStream("src\\IO\\testFiles\\testout2.txt");

            SequenceInputStream sis = new SequenceInputStream(fin1, fin2);

            int byteValue;
            while ((byteValue = sis.read()) != -1) {
                System.out.print((char) byteValue);
            }

            sis.close();
            fin1.close();
            fin2.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
