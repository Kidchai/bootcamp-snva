package IO.serialization;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {
    public static void main(String[] args) {
        try {
            InputStream fin = new FileInputStream("src\\IO\\testFiles\\employee.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Employee employee = (Employee) in.readObject();

            System.out.printf("Name: %s\nDepartment: %s\nSalary: %d\n", employee.name, employee.department,
                    employee.salary);

        } catch (java.io.IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
