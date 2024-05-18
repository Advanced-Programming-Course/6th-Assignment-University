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
        //سوال 6
        Human student=new Student();
        Human professor=new Professor();

        System.out.println(student instanceof Human); //true
        System.out.println(professor instanceof Human); //true


        //سوال7
        Human human1=new Student();
        human1.sayMyName();
        //output:My name is  null


        //سوال 8
        Human human2 = new Professor();
        human2.sayMyName();
        /* output:
        My name is null
        The professorFaculty is null
         */
    }
}
