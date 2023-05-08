package IO.IOstreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        try {
            String s = "Hello World!";
            byte[] b = s.getBytes();

            ByteArrayInputStream bin = new ByteArrayInputStream(b);

            while (bin.available() > 0) {
                System.out.print((char) bin.read());
            }

            bin.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
