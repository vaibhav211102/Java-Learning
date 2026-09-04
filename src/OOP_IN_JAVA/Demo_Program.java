package OOP_IN_JAVA;

public class Demo_Program {
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Vaibhav";
        s.age = 23;
        s.roll = 24120131;
        s.college = "Quantum University";

        s.markAttendence();

        s.print();
    }

    public static class Student{
        String name;
        int age;
        int roll;
        String college;

        void markAttendence(){
            System.out.println("Attendence marked by : " + name);
        }

        void print(){
            System.out.println(name + " " + age + " " + roll + " " + college);
        }
    }
}
