package exercise1;

import java.util.ArrayList;
import java.util.List;

// After completing the Student and Professor classes, create an instance of each one:
//  6. Using instanceof keyword, check if the instances that you have created are really an instance of human class
//  7. Write the following code: Human human = new Student(); What is the output of human.sayMyName() ?
//  8. Now write this:
//  Human human = new Professor();
//  What is the output of human.sayMyName() ?
//  9. What can we understand from question 7 and 8?
 
public class Main {
    public static void main(String[] args) {
        //Q6
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

        //Q7
        /*
        Human human = new Student("whatever");
        human.sayMyName();
        */

        //Q8
        /*
        Human human = new Professor("whatever");
        human.sayMyName();
        */


        //Q9
        /*
        یک نمونه از کلاس فرزند Student یا Professor به کلاس والد یعنی human اشاره دارد و با بازنویسی در کلاس فرزند اجرا میشود
        در نتیجه تغییرات در کلاس های فرزند بدون تغیر قسمت های دیگر اجرا میشود
         */
    }
}
