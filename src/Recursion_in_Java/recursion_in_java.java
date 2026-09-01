package Recursion_in_Java;

public class recursion_in_java {
    public static void main(String[] args) {
        printNumber(10);
    }

    static void printNumber(int n){
        if (n == 0) { // Base case to stop recursion...
            return;
        }

        printNumber(n - 1);
        System.out.print(n + " ");
    }
}
