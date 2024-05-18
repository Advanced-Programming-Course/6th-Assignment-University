//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human student = new Student("Arian");
        Human professor = new Professor("Ahmadi","idk");

        student.sayMyName(); // Q7
        System.out.println("-------------");
        professor.sayMyName(); // Q8

        System.out.println("-------------");

        if (student instanceof Human) { //Q6
            System.out.println("student is instance of human");
        }
        if (professor instanceof Human) {
            System.out.println("professor is instance of human");
        }
    }
}