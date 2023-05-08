package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConfigurationReader {
    public static void main(String[] args) {
        String fileName = "src\\IO\\testFiles\\test.properties";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
