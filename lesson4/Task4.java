package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task4 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        IntStream.range(0, 10)
                .mapToObj(i -> new Student(
                        "Student %d".formatted(i), 
                        "Group %d".formatted(i), 
                        StudentControll.getRandomCourse(), 
                        StudentControll.fillGrades()))
                .forEach(s -> students.add(s));

        students.add(new Student(
                "Student", 
                "Group", 
                1, 
                new ArrayList<>(List.of(2, 2, 2, 2, 2, 2))));
        
        students.forEach(s -> System.out.println(s));
        System.out.println();

        StudentControll.transferToNextCourse(students);
        System.out.println();

        StudentControll.printStudents(students, 4);
    }
}
