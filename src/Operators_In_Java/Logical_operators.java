package Operators_In_Java;

public class Logical_operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;

        System.out.println("Logical AND : " + ((a < b) && (b >= c)));
        System.out.println("Logical OR : " + ((a <= b) || (b > c)));
        System.out.println("Logical NOT : " + (!(a < b) && (b >= c)));

    }
}
