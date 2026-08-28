package Conditional_statement_in_Java;
import java.util.*;
public class nested_if_else_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter your age (or enter -1 to exit) : ");
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (0 < age && age <= 100) {
                if (age >= 18) {
                    System.out.println("You can vote!");
                    break;
                } else {
                    System.out.println("You can not vote!");
                    break;
                }
            }
            else {
                System.out.println("You entered wrong age!");
                System.out.print("Enter your age correctly : ");
                age = sc.nextInt();
            }
        }
    }
}
