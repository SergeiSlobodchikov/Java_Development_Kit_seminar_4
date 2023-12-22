package src;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();

        // Добавление сотрудников в справочник
        employeeList.addEmployee(new Employee(123, "1234567890", "John Doe", 5));
        employeeList.addEmployee(new Employee(456, "9876543210", "Jane Smith", 10));
        employeeList.addEmployee(new Employee(133, "1245454340", "Johffn Doe", 5));
        employeeList.addEmployee(new Employee(446, "9876543210", "Jane Smith", 15));
        employeeList.addEmployee(new Employee(173, "1234567890", "John Doe", 5));
        employeeList.addEmployee(new Employee(453, "9876543210", "Jan Smi", 7));
        employeeList.addEmployee(new Employee(223, "1234567890", "John Dos", 8));
        employeeList.addEmployee(new Employee(450, "9999999999", "Jane Smith", 12));




        // Поиск сотрудников в справочнике
//        employeeList.printAll();
        employeeList.findByName("John Doe");
        employeeList.findByTabelNumber(123);
        employeeList.findByWorkExperience(5);
        employeeList.findByPhoneNumber("9999999999");
        employeeList.findByName("Jo234e");
        employeeList.findByTabelNumber(1223);
        employeeList.findByWorkExperience(566);
        employeeList.findByPhoneNumber("993242399");
    }
}