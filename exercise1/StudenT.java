package exercise1;

// Human is an abstract concept, so we have created an abstract class to represent it...
// Implement or extend the Human class to make a student class.
// 2. Change the student class so that when we call the sayMyName() method on an instance of this class, the fullName attribute of the student is printed.
// 3.Add the following attributes to the student class with setters and getters: studentNumber, majorName, universityName

public class Student extends Human {
    private String studentNumber;
    private String majorName;
    private String universityName;

    public Student(String fullName) {
        super(fullName);
    }

  
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    
    @Override
    public void sayMyName() {
        System.out.println("My name is: " + getFullName());
    }
}

