package exercise1;

public abstract class Human {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void sayMyName() {
        System.out.println("I am a human!");
    }

    public final void staticPrint() {
        System.out.println("This function should always print this string in all subclasses");
    }
}
