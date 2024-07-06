public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "123456", "Computer Science", "XYZ University");
        student.sayMyName();

        Professor professor = new Professor("Jane Smith", "Mathematics", 10, "Calculus");
        professor.sayMyName();

        System.out.println(student instanceof Human); // Should print true
        System.out.println(professor instanceof Human); // Should print true
    }
}

// q9: