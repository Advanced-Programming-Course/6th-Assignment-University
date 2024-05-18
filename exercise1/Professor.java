package exercise1;

public class Professor extends Human {
    private String professorSpecialty;
    private String professorFaculty;
    private int numberOfCourses;

    public Professor(String fullName, String professorSpecialty, String professorFaculty, int numberOfCourses) {
        setFullName(fullName);
        this.professorSpecialty = professorSpecialty;
        this.professorFaculty = professorFaculty;
        this.numberOfCourses = numberOfCourses;
    }

    public void sayMyName() {
        System.out.println(getFullName() + " , " + professorFaculty);
    }

    public String getProfessorSpecialty() {
        return professorSpecialty;
    }

    public void setProfessorSpecialty(String professorSpecialty) {
        this.professorSpecialty = professorSpecialty;
    }

    public String getProfessorFaculty() {
        return professorFaculty;
    }

    public void setProfessorFaculty(String professorFaculty) {
        this.professorFaculty = professorFaculty;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public static void main(String[] args) {
        Professor p = new Professor("", "", "", 0);

        p.staticPrint();

        p.setFullName("sara mohamadi");
        System.out.println(p.getFullName());

        p.setProfessorSpecialty("Mathematics");
        System.out.println(p.getProfessorSpecialty());

        p.setProfessorFaculty("Science");
        System.out.println(p.getProfessorFaculty());

        p.setNumberOfCourses(10);
        System.out.println(p.getNumberOfCourses());

        p.sayMyName();
    }
}
