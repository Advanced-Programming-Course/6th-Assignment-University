class Student extends Human {
    String studentNumber;
    String majorName;
    String universityName;

    Student(String fullName, String number, String major, String uni) {
        super(fullName);
        studentNumber = number;
        majorName = major;
        universityName = uni;
    }

    void sayMyName() {
        System.out.println("Full Name: " + fullName);
    }
}
