public class Human {
    private String fullName;
    final String staticPrintOutput = "this function should always print this string in all subclasses";

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void sayMyName() {
        System.out.println("im a human!");
    }

    public String staticPrint() {
        return staticPrintOutput;
    }
}
