package lesson5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        EmployeeControll.fillList(employees, 10, 20, 40, 40000d, 300000d);
        System.out.println("Сотрудники");
        employees.stream().forEach(System.out::println);
        System.out.println();
        
        List<Employee> filteredEmployees = employees.stream()
                .filter(e -> e.getAge() > 30)
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println("Сотрудники старше 30 лет");
        filteredEmployees.stream().forEach(System.out::println);
        System.out.println();

        Long amountEmployeesFromIT = EmployeeControll
                .getEmployeeByDepartment(employees, "IT").stream().count();
        Long amountEmployeesOver30FromIT = EmployeeControll
                .getEmployeeByDepartment(filteredEmployees, "IT").stream().count();
        System.out.println("""
                Количество сотрудников из отдела IT: %d,
                Количество сотрудников старше 30 из отдела IT: %d
                """.formatted(amountEmployeesFromIT, amountEmployeesOver30FromIT));

        Employee employeeWithMaxSalary = employees.stream().max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Сотрудник с максимальной зарплатой: %s"
                .formatted(employeeWithMaxSalary));
        System.out.println();
        
        List<String> employeeNamesFormHR = EmployeeControll.getEmployeeByDepartment(employees, "HR").stream()
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Имена сотрудников из отдела HR: %s"
                .formatted(employeeNamesFormHR));
        System.out.println();

        Double averageSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, (x, y) -> x + y) / employees.size();
        System.out.println("Средняя зарплата сотрудников: %.2f".formatted(averageSalary));
    }
}
