package Functions_in_Java;

public class CHAINING_OF_FUNCTION {
    public static void main(String[] args) {
        // Chaining of Function
        fun1();
    }
    static void fun1(){
        fun2();
        System.out.println("BYE");
    }
    static void fun2(){
        fun3();
        System.out.println("HELLO");
    }

    static void fun3(){
        System.out.println("HI");
    }
}
