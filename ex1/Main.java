package exercise1;
 
public class Main {
    public static void main(String[] args) {
        Student student = new Student("amir", "222","Mathematics","Teh");
        Professor professor = new Professor("Dr.Asqari","Data Science", "Computer",1);
        System.out.println(student instanceof Human);
        System.out.println(professor instanceof Human);
        Human human = new Student("Soqra","333", "cs","Esf");
        human.sayMyName();
        Human human1 = new Professor("Dr.Akbari","Math","Science",2);
        human1.sayMyName();
    }
}
