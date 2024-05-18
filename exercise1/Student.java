package exercise1;

public class Student extends Human {
    private int studentNumber;
    private String majorName;
    private String universityName;

    public Student(String fullName, int studentNumber, String majorName, String universityName) {
        setFullName(fullName);
        this.studentNumber = studentNumber;
        this.majorName = majorName;
        this.universityName = universityName;
    }

    public void sayMyName() {
        System.out.println(getFullName());
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
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

    public static void main(String[] args) {
        Student s = new Student("", 0, "", "");
        s.sayMyName();


        s.staticPrint();

        s.setFullName("Ali Arad");
        System.out.println(s.getFullName());

        s.setStudentNumber(123456);
        System.out.println(s.getStudentNumber());

        s.setMajorName("Mathematics");
        System.out.println(s.getMajorName());

        s.setUniversityName("Tehran");
        System.out.println(s.getUniversityName());
    }
}
