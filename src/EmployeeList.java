package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeList {
    private List<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printEmployeeDetails(Employee employee) {
        System.out.println("Табельный номер: " + employee.getTabelNumber());
        System.out.println("Номер телефона: " + employee.getPhoneNumber());
        System.out.println("Имя: " + employee.getName());
        System.out.println("Стаж: " + employee.getWorkExperience());
        System.out.println();
    }
    public Employee findByWorkExperience(int workExperience) {
        int i = 0;
        for (Employee employee : employees) {
            if (employee.getWorkExperience() == workExperience) {
                System.out.println("Поиск по стажу " + workExperience + ": ");
                printEmployeeDetails(employee);
                i = 1;
            }
        }
        if (i == 0) {
            System.out.println("Не найден");
        }
        return null;
    }

    public Employee findByName(String name) {
        int i = 0;
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                System.out.println("Поиск по имени " + name + ": ");
                printEmployeeDetails(employee);
                i = 1;
            }
        }
        if (i == 0) {
            System.out.println("Не найден");
        }
        return null;
    }

    public Employee findByTabelNumber(int tabelNumber) {
        int i = 0;
        for (Employee employee : employees) {
            if (employee.getTabelNumber() == tabelNumber) {
                System.out.println("Поиск по номеру табеля " + tabelNumber + ": ");
                printEmployeeDetails(employee);
                i = 1;
            }
        }
        if (i == 0) {
            System.out.println("Не найден");
        }
        return null;
    }

    public String findByPhoneNumber(String phoneNumber) {
        int i = 0;
        for (Employee employee : employees) {
            if (Objects.equals(employee.getPhoneNumber(), phoneNumber)) {
                System.out.println("Поиск по номеру телефона " + phoneNumber + ": ");
                printEmployeeDetails(employee);
                i = 1;
            }
        }
        if (i == 0) {
            System.out.println("Не найден");
        }
        return null;
    }


    public void printAll() {
        for (Employee employee : employees) {
            printEmployeeDetails(employee);
        }
    }
}