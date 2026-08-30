package Conditional_statement_in_Java;

import java.util.Scanner;

public class nested_switch_statement_in_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Pizza");
        System.out.println("2. Burger");

        System.out.print("Choose a category: ");
        String category = sc.nextLine();

        switch (category) {

            case "1":
                System.out.println("\nPizza Menu:");
                System.out.println("1. Margherita");
                System.out.println("2. Farmhouse");

                System.out.print("Choose pizza: ");
                String pizza = sc.nextLine();

                switch (pizza) {

                    case "1":
                        System.out.println("You selected Margherita Pizza.");
                        break;

                    case "2":
                        System.out.println("You selected Farmhouse Pizza.");
                        break;

                    default:
                        System.out.println("Invalid pizza choice.");
                }
                break;

            case "2":
                System.out.println("\nBurger Menu:");
                System.out.println("1. Veg Burger");
                System.out.println("2. Cheese Burger");

                System.out.print("Choose burger: ");
                String burger = sc.nextLine();

                switch (burger) {

                    case "1":
                        System.out.println("You selected Veg Burger.");
                        break;

                    case "2":
                        System.out.println("You selected Cheese Burger.");
                        break;

                    default:
                        System.out.println("Invalid burger choice.");
                }
                break;

            default:
                System.out.println("Invalid category.");
        }

        sc.close();
    }
}