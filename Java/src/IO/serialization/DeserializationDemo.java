package IO.serialization;

import java.io.*;

public class DeserializationDemo {
    public static void main(String[] args) {
        try {
            InputStream fin = new FileInputStream("src\\IO\\testFiles\\student.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Student student = (Student) in.readObject();

            System.out.printf("Student id: %d\nStudent name: %s", student.id, student.name);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
