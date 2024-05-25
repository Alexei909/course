package lesson4;

import java.util.List;

public class Student extends Person {

    private String group;
    private int course;
    private List<Integer> grades;

    public Student() {}

    public Student(String name, String group, int course, List<Integer> grades) {
        super(name);
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getGroup() {
        return this.group;
    }

    public int getCourse() {
        return this.course;
    }

    public List<Integer> getGrades() {
        return this.grades;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void addGrade(Integer grade) {
        this.grades.add(grade);
    }

    public Double getAverageGrade() {
        List<Integer> grades = this.grades;
        Integer sumGrades = grades.stream().reduce(0, (x, y) -> x + y);
        return sumGrades/(double) grades.size();
    }

    @Override 
    public String  toString() {
        return "Student{" +
                "name=" + this.getName() +
                ", group=" + this.getGroup() +
                ", course=" + this.getCourse() +
                ", grades=" + this.getGrades() +
                "}"; 
    }
}
