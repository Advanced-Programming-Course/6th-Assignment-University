abstract class Human {
    String fullName;

    Human(String name) {
        fullName = name;
    }

    static void staticPrint() {
        System.out.println("Cannot be overridden.");
    }

    abstract void sayMyName();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
