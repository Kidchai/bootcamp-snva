package collections.iterable.collection.list;

import java.util.Comparator;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>(new EmployeeComparator());

        employees.add(new Employee("Mark Brooks", "Engineering & Technology", 28, 5000));
        employees.add(new Employee("Kareem Gill", "Finance", 30, 7000));
        employees.add(new Employee("Isabella Gibson", "Design", 27, 6500));
        employees.add(new Employee("David Hudson", "Finance", 34, 9000));
        employees.add(new Employee("Jessica Davies", "Sales, Service & Support", 36, 8500));
        employees.add(new Employee("Ashley Campbell", "Engineering & Technology", 26, 8000));

        for (Employee employee : employees) {
            System.out.printf("%s, %s, %d, %d\n", employee.getName(), employee.getDepartment(), employee.getAge(), employee.getSalary());
        }
    }
}

class Employee {
    private final String name;
    private final String department;
    private final int age;
    private final int salary;

    public Employee(String name, String department, int age, int salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getAge() {
        return this.age;
    }

    public int getSalary() {
        return this.salary;
    }
}

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
