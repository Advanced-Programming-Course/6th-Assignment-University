package exercise1;


// After completing the Student and Professor classes, create an instance of each one:
//  6. Using instanceof keyword, check if the instances that you have created are really an instance of human class
//  7. Write the following code: Human human = new Student(); What is the output of human.sayMyName() ?
//  8. Now write this:
//  Human human = new Professor();
//  What is the output of human.sayMyName() ?
//  9. What can we understand from question 7 and 8?
 
public class Main {
    public static void main(String[] args) {
        //Question6
        Student student = new Student("John Doe");
        Professor professor = new Professor("Dr. Smith");
        if (student instanceof Human) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        if (professor instanceof Human) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        //Question7
        /*
        Human human = new Student("whatever");
        human.sayMyName();
        */
        //Question8
        /*
        Human human = new Professor("whatever");
        human.sayMyName();
        */
        //Question9
        //Taghiri dar yek class tasiri bar digari nadarad.
    }
}
