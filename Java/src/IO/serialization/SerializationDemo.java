package IO.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "John");
        OutputStream fout;

        {
            try {
                fout = new FileOutputStream("src\\IO\\testFiles\\student.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);

                out.writeObject(student);
                out.close();
                System.out.println("Successfully written to file");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Student implements java.io.Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
