package Variables_and_Datatypes;

public class variables {
    public static void main(String[] args) {
//        Integers - byte,short,int,long
        //        Binary , Octal , Hexadecimal
//        byte b = 10;
//        byte b = 0b101; binary
//        byte b = 06; /* 0 - 7 */  // octal
        byte b = 0X5;  // hexadecimal (0 - 15 ) --> 0-9,A,B,C,D,E,F
        short s = 144;
        int i = 600000;
        long l = 2952___95022;

        System.out.println("Byte : "+b);
        System.out.println("Short : "+s);
        System.out.println("Integer: "+i);
        System.out.println("Long : "+l);

//        Real Number - float,double

        float f = 10.25f;
//        double d = 34.3434; // standard way to store
        double d = 6.022e23;

        System.out.println("Float : "+f);
        System.out.println("Double : "+d);
//        Characters

        char c = 'V';

        System.out.println("Character : "+c);

//        Boolean

        boolean t = true;

        System.out.println("Boolean : "+t);

    }
}
