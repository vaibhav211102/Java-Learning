package Operators_In_Java;

public class Assignment_operators {
    public static void main(String[] args) {
        int a = 5; // Simple Assignment

        System.out.println("Add Assign : " + (a+=2));
        System.out.println("Subtract & Assign : " + (a-=2));
        System.out.println("Multiply & Assign : " + (a*=2));
        System.out.println("Divide & Assign : " + (a/=2));
        System.out.println("Modulus & Assign: " + (a%=2));
        System.out.println("Bitwise AND & Assign : " + (a&=2));
        System.out.println("Bitwise XOR & Assign : " + (a^=2));
        System.out.println("ALeft Shift & Assign : " + (a<<=2));
        System.out.println("Right Shift & Assign : " + (a>>=2));
        System.out.println("Unsigned Right Shift & Assign : " + (a>>>=2));

    }
}
