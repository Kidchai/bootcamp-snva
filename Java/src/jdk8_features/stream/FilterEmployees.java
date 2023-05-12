package jdk8_features.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Daniel Wright", 37, 53_000));
        employees.add(new Employee("Susan Sparks", 25, 40_000));
        employees.add(new Employee("Colin Harris", 40, 50_000));
        employees.add(new Employee("Kimberly Murray", 32, 52_000));
        employees.add(new Employee("Christine Rios", 28, 47_000));

        List<Employee> filteredList = employees.stream()
                .filter(e -> e.getSalary() > 50_000)
                .toList();

        for (Employee employee : filteredList) {
            System.out.printf("%s, %d, %d\n", employee.getName(), employee.getAge(), employee.getSalary());
        }
    }
}

class Employee {
    private String name;
    private Integer age;
    private Integer salary;

    Employee(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }
}
