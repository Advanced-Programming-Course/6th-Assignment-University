package exercise1;

// Implement or extend the human class to make a professor class...
//  4.Add the following attributes to this class with setters and getters: professorSpecialty, professorFaculty, numberOfCourse
//  5.Change the professor class so that when we call the sayMyName() method on an instance of this class, fullName of the professor plus their professorFaculty is printed.
 
public class Professor extends Human{
    private String professorSpecialty;
    private String professorFaculty;
    private int numberOfCourses;
    
    // public Professor(String fullName){
    //     super.setFullName(fullName);
    // }
    
    // professorSpecialty
    public String getProfessorSpecialty(){
        return professorSpecialty;
    }
    public void setProfessorSpecialty(String professorSpecialty){
        this.professorSpecialty = professorSpecialty;
    }
    
    // professorFaculty
    public String getProfessorFaculty(){
        return professorFaculty;
    }
    public void setProfessorFaculty(String professorFaculty){
        this.professorFaculty = professorFaculty;
    }
    
    // numberOfCourse
    public int getNumberOfCourses(){
        return numberOfCourses;
    }
    public void setNumberOfCourses(int numberOfCourses){
        this.numberOfCourses = numberOfCourses;
    }
    
    // sayMyName
    public void sayMyName(){
        System.out.println("FullName: " + getFullName());
        System.out.println("ProfessorFaculty: " + getProfessorFaculty());
    }
}
