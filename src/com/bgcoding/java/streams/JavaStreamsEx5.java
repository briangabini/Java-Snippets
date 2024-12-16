package com.bgcoding.java.streams;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamsEx5 {

    public static class Employee {
        public String salary;
        public Employee(String salary) {
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee("5000"));
        employeesList.add(new Employee("6000"));
        employeesList.add(new Employee("4000"));

        int sum = employeesList.stream()
                .map(employee -> employee.salary)
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);

        System.out.println("Sum of salaries: " + sum);
    }
}
