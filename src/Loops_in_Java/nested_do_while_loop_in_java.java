package Loops_in_Java;

public class nested_do_while_loop_in_java {
    public static void main(String[] args) {
        int i = 5;

        for (int j = i; j >= 1; j--) {
            for (int k = j; k >= 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
