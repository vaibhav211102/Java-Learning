package Type_Conversion;

public class type_conversion {
    public static void main(String[] args) {
//        Type Casting in Java

//        Rules of Type conversion
//        Types - Implicit , Explicit

//        byte b = 32;
//        int i;
////        This is called implicit type conversion or widening conversion
//        i = b;
//
//        System.out.println(i);
//
//        float f = 2.223f;
//
//        int n ;
////        This is called explicit type conversion or narrowing conversion
//        n = (int)f;
//
//        System.out.println(n);
//
////        Truncating conversion
//
//        float h = 16.25f;
//
//        int s;
//
//        s = (int)h; // Here the decimal part will truncate after conversion
//
//        char ch = 'a';
//
//        int t;
//
//        t = (int)ch;
//
//        System.out.println(t);
//
//
////        Boolean to any data type conversion - These conversions are not possible.
//
//        byte k = 50;
//
//        k = (byte)(k*2); // Error without casting - This is called type promotion - Here we can not store (int) value in byte without casting.
//

//        Understanding the type promotion with example :-
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s) ;

//         f * b --> float
//         i / c --> integer
//         d * s --> double

        System.out.println((f * b)+"+"+(i / c)+"-"+(d * s));
        System.out.println("Result : "+result);
    }
}
