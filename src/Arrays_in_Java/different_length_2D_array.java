package Arrays_in_Java;
import java.util.*;
public class different_length_2D_array {
    public static void main(String[] args) {

//        int[][] arr = new int[3][];
//
//        arr[0] = new int[2];
//        arr[1] = new int[3];
//        arr[2] = new int[4];

//        int [][] arr = {
//                {10,20},
//                {10,20,30,40},
//                {45,50,60}
//        };
//
//        System.out.println("Matrix : ");
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        int [][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter size of row " + (i + 1) + " :");
            int size = sc.nextInt();
            matrix[i] = new int[size];
        }

        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter the element of row " + (i +1) + " :");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix : ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
