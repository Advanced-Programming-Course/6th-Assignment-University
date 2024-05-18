package exercise1;
public class Professor extends Human {
    private String professorSpecialty;
    private String professorFaculty;
    private int numberOfCourses;

    public Professor(String fullName, String professorSpecialty, String professorFaculty, int numberOfCourses) {
        setFullName(fullName);
        setProfessorSpecialty(professorSpecialty);
        setProfessorFaculty(professorFaculty);
        setNumberOfCourses(numberOfCourses);
    }

    public Professor() {
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

    @Override
    public void sayMyName() {
        System.out.println(getFullName() + "-" + getProfessorFaculty());
    }
}