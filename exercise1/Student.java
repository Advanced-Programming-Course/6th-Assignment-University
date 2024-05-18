package exercise1;
public class Student extends Human {
    private int studentNumber;
    private String majorName;
    private String universityName;

    public Student(String fullName, int studentNumber, String majorName, String universityName) {
        setFullName(fullName);
        setStudentNumber(studentNumber);
        setUniversityName(universityName);
        setMajorName(majorName);
    }

    public Student(){
    }


    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
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
        System.out.println(getFullName());
    }
}
