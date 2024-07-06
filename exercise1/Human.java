abstract class Human {
    String fullName;

    Human(String name) {
        fullName = name;
    }

    static void staticPrint() {
        System.out.println("Cannot be overridden.");
    }

    abstract void sayMyName();
}
