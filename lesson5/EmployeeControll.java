package lesson5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeControll {

    private static final Random random = new Random();
    private static final Map<Integer, String> departments = new HashMap<Integer, String>() {{
            put(0, "IT");
            put(1, "HR");}};

    public static List<Employee> getEmployeeByDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .collect(Collectors.toList());
    }

    public static void fillList(List<Employee> list, 
                                Integer numberEmployees,
                                Integer minAge,
                                Integer maxAge,
                                Double minSalary,
                                Double maxSlary) {
        IntStream.range(0, numberEmployees)
                .mapToObj(i -> new Employee(
                        "Employee %s".formatted((char) (random.nextInt(26) + 'a')),
                        getRandomAge(minAge, maxAge),
                        getRandomDepartment(),
                        getRandomSalary(minSalary, maxSlary)))
                .forEach(list::add);
    }

    public static Integer getRandomAge(Integer min, Integer max) {
        return random.nextInt(min, max+1);
    }

    public static String getRandomDepartment() {
        Integer index = random.nextInt(0, departments.size());
        return departments.get(index);
    }

    public static Double getRandomSalary(Double min, Double max) {
        return Math.ceil(random.nextDouble(min, max+1) * 100) / 100;
    }
}
