package Functions_in_Java;

public class FUNCTION_OVERLOADING {

    public static void main(String[] args) {


        // 1. DIFFERENT NUMBER OF PARAMETERS

        System.out.println(sum(10, 20));

        // Calls sum(int, int)
        // Because 2 integer arguments are passed

        System.out.println(sum(10, 20, 30));

        // Calls sum(int, int, int)
        // Because 3 integer arguments are passed

        // 2. DIFFERENT DATA TYPES

        System.out.println(sum(10, 20.5f));

        // Calls sum(int, float)
        // First argument = int
        // Second argument = float

        System.out.println(sum(10.5f, 20.5f));

        // Calls sum(float, float)
        // Both arguments are float

        // 3. DIFFERENT ORDER OF PARAMETERS


        display(10, 20.5f);

        // Calls display(int, float)
        // Order = int → float

        display(20.5f, 10);

        // Calls display(float, int)
        // Order = float → int

        // 4. DIFFERENT NUMBER + DIFFERENT DATA TYPES


        display(10);

        // Calls display(int)
        // Only one int argument

        display(10.5f);

        // Calls display(float)
        // Only one float argument

        // 5. MORE EXAMPLES OF OVERLOADING


        multiply(5, 4);

        // Calls multiply(int, int)

        multiply(5, 4, 3);

        // Calls multiply(int, int, int)

        multiply(5.5f, 2.0f);

        // Calls multiply(float, float)
    }

    // METHOD OVERLOADING - 1
    // DIFFERENT NUMBER OF PARAMETERS

    static int sum(int a, int b) {
        return a + b;
    }


    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // METHOD OVERLOADING - 2
    // DIFFERENT DATA TYPES

    static int sum(int a, float b) {
        return (int) (a + b);
    }


    static float sum(float a, float b) {
        return a + b;
    }

    // METHOD OVERLOADING - 3
    // DIFFERENT ORDER OF PARAMETERS

    static void display(int a, float b) {

        System.out.println("display(int, float)");
    }


    static void display(float a, int b) {

        System.out.println("display(float, int)");
    }

    // METHOD OVERLOADING - 4
    // DIFFERENT NUMBER + DIFFERENT DATA TYPE

    static void display(int a) {

        System.out.println("display(int)");
    }


    static void display(float a) {

        System.out.println("display(float)");
    }

    // METHOD OVERLOADING - 5
    // ANOTHER EXAMPLE

    static int multiply(int a, int b) {

        return a * b;
    }


    static int multiply(int a, int b, int c) {

        return a * b * c;
    }


    static float multiply(float a, float b) {

        return a * b;
    }
}