package Conditional_statement_in_Java;

import java.util.Scanner;

public class switch_statement_in_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Enter day number (1-7) or (Enter -1 to exit): ");
            int day = sc.nextInt();

            if (day == -1) {
                System.out.println("Exit!");
                break;
            }

            switch (day) { // switch(expression) --> byte,short,int,char,Enumeration

                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("You entered the wrong day and please enter right day!");
            }
        }
        sc.close();
    }
}