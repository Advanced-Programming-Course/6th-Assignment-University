package exercise1;

public class Main {
    public static void main(String[] args) {
        Human student = new Student();
        Human professor = new Professor();

        System.out.println("Is student an instance of Human? " + (student instanceof Human));
        System.out.println("Is professor an instance of Human? " + (professor instanceof Human));

        student.sayMyName();
        professor.sayMyName();
    }
}
