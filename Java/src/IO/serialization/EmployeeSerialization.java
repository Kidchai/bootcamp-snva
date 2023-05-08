package IO.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class EmployeeSerialization {
    public static void main(String[] args) {
        Employee employee = new Employee("Alex", "IT", 40000);
        OutputStream fout;

        {
            try {
                fout = new FileOutputStream("src\\IO\\testFiles\\employee.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);

                out.writeObject(employee);
                out.close();
                System.out.println("Successfully written to file");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Employee implements java.io.Serializable {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
