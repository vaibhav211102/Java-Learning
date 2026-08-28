package Operators_In_Java;

public class Bitwise_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;

        System.out.println("Bitwise AND : " +(a & b));
        System.out.println("Bitwise OR : " +(a | b));
        System.out.println("Bitwise XOR : " +(a ^ b));
        System.out.println("Bitwise NOT : " +(~a));

        b = b << 1; // Left  Shift;

        System.out.println("Bitwise Left Shift : " + b); // Number * 2 in left shift

        a = a >> 1;

        System.out.println("Bitwise Right Shift : " + a); // Number / 2 in right shift

//        int i = 1;
//
//        int n = i << 31;
//
//        System.out.println(n);

        int c = -128;

        c = c >>> 1;

        System.out.println("Bitwise Unsigned Right Shift : " + c);
    }
}
