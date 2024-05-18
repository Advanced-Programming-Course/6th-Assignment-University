package exercise1;

// Human is an abstract concept, so we have created an abstract class to represent it...
// Implement or extend the Human class to make a student class.
// 2. Change the student class so that when we call the sayMyName() method on an instance of this class, the fullName attribute of the student is printed.
// 3.Add the following attributes to the student class with setters and getters: studentNumber, majorName, universityName

public class Student {
    public class Student extends Human{
        @override
        //سوال 2
        public void sayMyName(){
            System.out.println("My name is  " + getFullName());

        }
    }
}
