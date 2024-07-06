class Professor extends Human {
    String professorFaculty;
    int numberOfCourse;
    String professorSpecialty;

    Professor(String fullName, String faculty, int courses, String specialty) {
        super(fullName);
        professorFaculty = faculty;
        numberOfCourse = courses;
        professorSpecialty = specialty;
    }

    void sayMyName() {
        System.out.println("Full Name: " + fullName + ", Faculty: " + professorFaculty);
    }
}
