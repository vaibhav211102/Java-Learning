package Loops_in_Java;
import java.util.*;
public class nested_for_loop_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int i = sc.nextInt();

        first: for (int k = 1; k <= i; k++) {
           second: for (int l = 1; l <= k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
