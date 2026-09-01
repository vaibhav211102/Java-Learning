package Functions_in_Java;

public class SCOPE_OF_VARIABLES {

    static String name = "Vaibhav"; // Global Variable

    public static void main(String[] args) {
        greet();
        System.out.println(name + ", " + "Learning Java!");

        int a = 21; // Local Variable
        System.out.println(a);
    }

    static void greet() {
        System.out.println("Hello " + name);
    }
}
