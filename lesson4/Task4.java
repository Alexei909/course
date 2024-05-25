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

    static class StudentControll {

        private static final int MIN_COURSE = 1;
        private static final int MAX_COURSE = 4;
        private static final int MIN_GRADE = 2;
        private static final int MAX_GRADE = 5;
    
        private int getRandomCourse() {
            return (int) ((Math.random() * (MAX_COURSE + 1 - MIN_COURSE)) + MIN_COURSE);
        }
    
        private int getRandomGrade() {
            return (int) ((Math.random() * (MAX_GRADE + 1 - MIN_GRADE)) + MIN_GRADE);
        }
    
        private List<Integer> fillGrades() {
            List<Integer> grades = new ArrayList<>();
            IntStream.range(0, 10)
                    .forEach(i -> grades.add(this.getRandomGrade()));
    
            return grades;
        }

        private void transferToNextCourse(List<Student> students) {
            int originalLength = students.size();
            List<Student> notPassed = new ArrayList<>();

            students.forEach(s -> {
                    if (Double.compare(s.getAverageGrade(), 3.0) == -1) {
                        notPassed.add(s);
                    } else if (Double.compare(s.getAverageGrade(), 3.0) >= 0) {
                        s.setCourse(s.getCourse() + 1);
                    }});

            students.removeAll(notPassed);

            System.out.println("%d students did not progress to the next course"
                    .formatted(originalLength - students.size()));
        }

        private void printStudents(List<Student> students, int course) {
            System.out.println("-----------%d course-----------".formatted(course));
            students.forEach(s -> {
                if (s.getCourse() == course) System.out.println("Student: %s"
                        .formatted(s.getName()));});
        }
    }
}
