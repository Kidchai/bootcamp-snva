package IO.IOstreams;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.DataInputStream;

public class DataInputStreamDemo {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("src\\IO\\testFiles\\testout.txt");
            DataInputStream din = new DataInputStream(in);

            int byteValue;
            while ((byteValue = din.read()) != -1) {
                System.out.print((char) byteValue);
            }

            din.close();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
