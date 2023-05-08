package IO.readersWriters;

import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src\\IO\\testFiles\\testout.txt");

            while (fr.ready()) {
                System.out.print((char) fr.read());
            }

            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
