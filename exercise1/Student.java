package exercise1;

// Human is an abstract concept, so we have created an abstract class to represent it...
// Implement or extend the Human class to make a student class.
// 2. Change the student class so that when we call the sayMyName() method on an instance of this class, the fullName attribute of the student is printed.
// 3.Add the following attributes to the student class with setters and getters: studentNumber, majorName, universityName

public class Student {
    public class Student extends Human{
        // سوال 3
        private int studentNumber;
        private String majorName;
        private String universityName;

        public int getStudentNumber(){
            return studentNumber;
        }
        public void setStudentNumber(int studentNumber){
            this.studentNumber=studentNumber;
        }
        public String getMajorName(){
            return majorName;
        }
        public void setMajorName(String majorName){
            this.majorName=majorName;
        }
       public String getUniversityName(){
            return universityName;
       }
       public void setUniversityName(String universityName){
            this.universityName=universityName;
       }


        @Override
        //سوال 2
        public void sayMyName(){
            System.out.println("My name is  " + getFullName());

        }
    }
}
