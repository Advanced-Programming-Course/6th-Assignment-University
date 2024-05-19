package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("John Doe");
        student.setStudentNumber(123);
        student.setMajorName("Computer Science");
        student.setUniversityName("Harvard University");

        Professor professor = new Professor();
        professor.setFullName("Jane Smith");
        professor.setProfessorSpecialty("Mathematics");
        professor.setProfessorFaculty("Faculty of Science");
        professor.setNumberOfCourse(5);

        List<Human> humans = new ArrayList<>();
        humans.add(student);
        humans.add(professor);

        for (Human human : humans) {
            if (human instanceof Student) {
                System.out.println("This is a Student");
            } else if (human instanceof Professor) {
                System.out.println("This is a Professor");
            }
            human.sayMyName();
        }

        Human human1 = new Student();
        human1.setFullName("Alice Brown");
        human1.sayMyName(); // Output: Alice Brown

        Human human2 = new Professor();
        human2.setFullName("Bob Johnson");
        human2.sayMyName(); // Output: Bob Johnson from null (since professorFaculty is not set)
    }
}
