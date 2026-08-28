package Operators_In_Java;

public class Arithmetic_operators {
    public static void main(String[] args) {
//        Operators in Java

//          Arithmetic Operators --> +,-,*,/ etc.

//        int a = 11;
//        int b = 5;
//
//        System.out.println("Addition : "+(a + b));
//        System.out.println("Subtraction : "+(a - b));
//        System.out.println("Multiplication : "+(a * b));
//        System.out.println("Division : "+(a / b));
//        System.out.println("Modules : "+(a % b));
//        System.out.println("Increment : "+(a++));
//        System.out.println("Decrement : "+(b--));

        // Pre increment/decrement and Post increment/decrement.

        int i = 10;

        ++i; // pre increment
        i++; // post increment

//        System.out.println(i); // i = 12

        int k = i++;

//        System.out.println(k); // 12

//        The value of k is 12 because the meaning of the line
//        int k = i++; is first k = i and then i = i + 1.

//        System.out.println("i : "+i+" k : "+k); // i = 13 and k = 12

        k = ++i;

        System.out.println(k);

//        The meaning of the line k = ++i;
//        is first increment the value of
//        i and then assign the value to
//        the k .
    }
}
