package lesson5;

public class Employee {

    private String name;
    private Integer age;
    private String department;
    private Double salary;

    public Employee() {}

    public Employee(String name, Integer age, String department, Double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getDepartment() {
        return this.department;
    }

    public Double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + this.name +
                ", age=" + this.age +
                ", department=" + this.department +
                ", slary=" + this.salary + "}";
    }
}
