package Loops_in_Java;
public class nested_while_loop_in_java {
    public static void main(String[] args) {

        int num = 1;

        while (num <= 10){
            int i = 1;

            while (i <= 10) {

                System.out.print((num * i) +"\t");
                i++;
            }
            System.out.println();
            num++;
        }
    }
}
