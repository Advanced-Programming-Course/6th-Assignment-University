public class Human {

    public final static void staticPrint() {
        System.out.println("This is a static method in Human class");
    }

    String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /*  public void setFullName(String fullName) {
           System.out.print(fullName);
       }*/

    public void sayMyName() {
        System.out.println(" human " /* or fullName */ );
    }
    }