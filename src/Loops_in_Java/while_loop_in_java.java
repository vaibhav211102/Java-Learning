package Loops_in_Java;
import java.util.*;
public class while_loop_in_java {
    public static void main(String[] args) {
        // while Loop in Java

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int num = sc.nextInt();
        int i = 1;

        while (i <= 10){
            System.out.println((num * i));
            i++;
        }
    }
}
