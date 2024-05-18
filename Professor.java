public class Professor extends Human {
    private String professorFaculty;
    private int numberOfCourse;
    private String professorSpecialty;

    Professor(String name,String faculty) {
        setFullName(name);
        setProfessorFaculty(faculty);
    }

    @Override
    public void sayMyName() {
        System.out.println("Im "+ getFullName()+"\nand my faculty is "+ professorFaculty);
    }

    public void setProfessorFaculty(String professorFaculty) {
        this.professorFaculty = professorFaculty;
    }
    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }
    public void setProfessorSpecialty(String professorSpecialty) {
        this.professorSpecialty = professorSpecialty;
    }

    public String getProfessorFaculty() {
        return professorFaculty;
    }
    public int getNumberOfCourse() {
        return numberOfCourse;
    }
    public String getProfessorSpecialty() {
        return professorSpecialty;
    }
}
