package Conditional_statement_in_Java;
import java.util.*;
public class if_else_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("The number is even : " + num);
        }
        else {
            System.out.println("The number is odd : " + num);
        }
    }
}
