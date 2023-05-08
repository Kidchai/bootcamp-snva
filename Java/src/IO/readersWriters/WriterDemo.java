package IO.readersWriters;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("src\\IO\\testFiles\\testout3.txt");
            fw.write("File #3. This line is written using FileWriter class");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Successfully written to file");
    }
}
