package IO.readersWriters;

import java.io.*;

public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        try {
            OutputStream fout = new FileOutputStream("src\\IO\\testFiles\\testout4.txt");
            OutputStreamWriter out = new OutputStreamWriter(fout);

            out.write("File #4. This line is written using OutputStreamWriter class");
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Successfully written to file");
    }
}
