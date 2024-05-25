package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task4 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        StudentControll studentControll = new StudentControll();

        IntStream.range(0, 10)
                .mapToObj(i -> new Student(
                        "Student %d".formatted(i), 
                        "Group %d".formatted(i), 
                        studentControll.getRandomCourse(), 
                        studentControll.fillGrades()))
                .forEach(s -> students.add(s));

        students.add(new Student(
                "Student", 
                "Group", 
                1, 
                new ArrayList<>(List.of(2, 2, 2, 2, 2, 2))));
        
        students.forEach(s -> System.out.println(s));
        System.out.println();

        studentControll.transferToNextCourse(students);
        System.out.println();

        studentControll.printStudents(students, 4);
    }
}
