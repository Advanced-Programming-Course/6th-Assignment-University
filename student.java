package exercise1;

public class Student extends Human {
    private String studentNumber;
    private String majorName;
    private String universityName;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    
    public void sayMyName() {
        System.out.println("Full Name: " + getFullName());
    }
}
