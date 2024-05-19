public class Professor extends Human {
    private String professorFaculty;;
    private int numberOfCourse;
    private String professorSpecialty;

    public String getProfessorFaculty(){
    return professorFaculty;
    }
    public void setProfessorFaculty(String professorFaculty){
        this.professorFaculty=professorFaculty;
    }

    public int getNumberOfCourse(){
        return numberOfCourse;
    }
    public void setNumberOfCourse(int numberOfCourse){
        this.numberOfCourse=numberOfCourse;
    }

    public String getProfessorSpecialty(){
        return professorSpecialty;
    }
    public void setProfessorSpecialty(String professorSpecialty){
        this.professorSpecialty=professorSpecialty;
    }


    public void sayMyName(){
        System.out.println( getFullName());
        System.out.println( getProfessorFaculty());
    }

}