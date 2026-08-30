package Loops_in_Java;
import java.util.*;
public class do_while_loop_in_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int i = 1;

        do {
            System.out.println(num*i);
            i++;
        }while (i <= 10);
    }
}
