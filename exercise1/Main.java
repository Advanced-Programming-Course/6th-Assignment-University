package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Ali Arad", 123456, "Mathematics", "Tehran");
        Professor professor1 = new Professor("sara mohamadi", "Mathematics", "Science", 10);

        System.out.println(student1 instanceof Human);
        System.out.println(professor1 instanceof Human);

        Human human = new Student("zahra karimi", 54321, "Chemistry", "london");
        human.sayMyName();

        human = new Professor("maryam", "Physics", "Engineering", 5);
        human.sayMyName();

    }
}
