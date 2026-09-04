package OOP_IN_JAVA;

public class Demo_Constructor {
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Vaibhav";
        s.age = 23;
        s.rollno = 1;
        s.college = "QU";

        System.out.println(s.name); // Default Value - null
        System.out.println(s.age); // 0
        System.out.println(s.rollno); // 0
        System.out.println(s.college); // null

//        int a;
//        System.out.println(a); // local variable connot be initialized

    }
    static class Student{
        String name; // information/data/characteristics --> instance variables
        int age;
        int rollno;
        String college;
    }
}
