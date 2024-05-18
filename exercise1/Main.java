package exercise1;
 
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Professor professor = new Professor();

        if (student instanceof Human) {
            System.out.println("student is an instance of Human");
        }
        else
            System.out.println("student is not an instance of Human");
        if (professor instanceof Human) {
            System.out.println("professor is an instance of Human");
        }
        else
            System.out.println("professor is not an instance of Human");

        Human human_student = new Student("student_name", 1, "math", "beheshti");
        Human human_professor = new Professor("professor_name", "number theory", "mathematics", 24);

        human_student.sayMyName();
        human_professor.sayMyName();
    }
}
