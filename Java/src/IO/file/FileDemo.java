package IO.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("src\\IO\\testFiles\\testout6.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created!");
            } else {
                System.out.println("File already exists");
            }

            String path = file.getAbsolutePath();
            System.out.println("Absolute path: " + path);

            File folder = file.getParentFile();
            String fileList[] = folder.list();

            for (String name : fileList) {
                System.out.println(name);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
