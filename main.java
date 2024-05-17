package exercise1;

public class Professor extends Human {
    private String professorSpecialty;
    private String professorFaculty;
    private int numberOfCourses;

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
        System.out.println("Full Name: " + getFullName() + ", Faculty: " + getProfessorFaculty());
    }
}
