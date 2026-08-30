package Loops_in_Java;
import java.util.*;
public class for_loop_in_java {
    public static void main(String[] args) {
        // for Loop in Java

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}
