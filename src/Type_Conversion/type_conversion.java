package Type_Conversion;

public class type_conversion {
    public static void main(String[] args) {
//        Type Casting in Java

//        Rules of Type conversion
//        Types - Implicit , Explicit

        byte b = 32;
        int i;
//        This is called implicit type conversion or widening conversion
        i = b;

        System.out.println(i);

        float f = 2.223f;

        int n ;
//        This is called explicit type conversion or narrowing conversion
        n = (int)f;

        System.out.println(n);

//        Truncating conversion

        float h = 16.25f;

        int s;

        s = (int)h; // Here the decimal part will truncate after conversion

        char ch = 'a';

        int t;

        t = (int)ch;

        System.out.println(t);

    }
}
