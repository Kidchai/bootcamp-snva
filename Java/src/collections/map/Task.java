package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(1, new Employee(1, "John", "IT", 1000));
        employeeMap.put(2, new Employee(2, "Mary", "IT", 2000));
        employeeMap.put(3, new Employee(3, "Mike", "Customer support", 3000));
        employeeMap.put(4, new Employee(4, "Jane", "HR", 4000));

        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.printf("""
                            Id: %d
                            Name: %s
                            Department: %s
                            Salary: %d
                            
                            """,
                    entry.getValue().getId(), entry.getValue().getName(), entry.getValue().getDepartment(), entry.getValue().getSalary());
        }
    }
}

class Employee {
    private int id;
    private String name;
    private String department;
    private int salary;

    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }
}
