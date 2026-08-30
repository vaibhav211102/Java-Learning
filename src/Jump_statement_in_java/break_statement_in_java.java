package Jump_statement_in_java;
import java.util.*;
public class break_statement_in_java {
    public static void main(String[] args) {

//        for (int j = 1; j <= 10; j++) {
//            System.out.println(j);
//            if (j == 5){
//                break;
//            }
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int p = sc.nextInt();
        int i;

        for (i = 2; i < p; i++) {
            if (p % i == 0){
                System.out.println("The number is not prime!");
                break;
            }
        }

        if (i == p) {
            System.out.println("The number is prime!");
        }
    }
}
