package IO.IOstreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        try {
            OutputStream fout = new FileOutputStream("src\\IO\\testFiles\\testout5.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            String line = "File #5. This line is written using BufferedOutputStream class";
            byte[] b = line.getBytes();
            bout.write(b);

            bout.close();
            System.out.println("Successfully written to file");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
