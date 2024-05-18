public class Student extends Human {
    private int studentNumber;
    private String majorName;
    private String universityName;

    Student(String name) {
        setFullName(name);
    }

    @Override
    public void sayMyName() {
        System.out.println("Im "+ getFullName());
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
    public String getMajorName() {
        return majorName;
    }
    public String getUniversityName() {
        return universityName;
    }
}
