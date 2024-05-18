package exercise1;

// 1.Change the staticPrint() method so that its output cannot be changed in all the classes that extend or implement Human.

public abstract class Human{
    private String fullName;

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void sayMyName(){
        System.out.println("im a human!");
    }

    public static final void staticPrint(){
        System.out.println("this function should always print this string in all subclasses");
    }
}
