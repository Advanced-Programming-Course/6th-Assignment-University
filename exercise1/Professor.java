package exercise1;

// Implement or extend the human class to make a professor class...
//  4.Add the following attributes to this class with setters and getters: professorSpecialty, professorFaculty, numberOfCourse
//  5.Change the professor class so that when we call the sayMyName() method on an instance of this class, fullName of the professor plus their professorFaculty is printed.
 

    public class Professor extends Human{
        // سوال 4
        private String professorFaculty;
        private String professorSpecialty;
        private int numberOfCourse;

        public String getProfessorFaculty(){
            return professorFaculty;
        }
        public void setProfessorFaculty(String professorFaculty){
            this.professorFaculty=professorFaculty;
        }
        public String getProfessorSpecialty(){
            return professorSpecialty;
        }
        public void setProfessorSpecialty(String professorSpecialty){
            this.professorSpecialty=professorSpecialty;
        }
        public int getNumberOfCourse(){
            return numberOfCourse;
        }
        public void setNumberOfCourse(int numberOfCourse){
            this.numberOfCourse=numberOfCourse;
        }


        @Override
        //سوال 5
        public void sayMyName(){
            System.out.println("My name is " + getFullName());
            System.out.println(" The professorFaculty is "+ getProfessorFaculty());
        }

    }


