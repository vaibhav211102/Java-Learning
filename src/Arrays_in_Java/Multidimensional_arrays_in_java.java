package Arrays_in_Java;
import java.util.*;
public class Multidimensional_arrays_in_java {
    public static void main(String[] args) {
//        Multidimensional Arrays...

//         2D Array...
//        // Declaration
//        int[][] arr;
//
//        // Creation
//        arr = new int[3][4];
//
//        // Declaration + Creation
//        int[][] arr = new int[3][4];
//
//        // Declaration + Initialization
//        int[][] arr = {
//                {10, 20, 30, 40},
//                {50, 60, 70, 80},
//                {90, 100, 110, 120}
//        };

//         3D Array...
       // Declaration
//        int[][][] arr;
//
//        // Creation
//        arr = new int[2][3][4];
//
//        // Declaration + Creation
//        int[][][] arr = new int[2][3][4];
//
//        // Declaration + Initialization
//        int[][][] arr = {
//                {
//                        {1, 2, 3, 4},
//                        {5, 6, 7, 8},
//                        {9, 10, 11, 12}
//                },
//                {
//                        {13, 14, 15, 16},
//                        {17, 18, 19, 20},
//                        {21, 22, 23, 24}
//                }
//        };

        Scanner sc = new Scanner(System.in);
//        int [][] marks = new int[3][3];
//
//        marks[0][0] = 100;
//
//        System.out.println(marks[0][0]);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter column : ");
        int cols = sc.nextInt();

        int [][] arr = new int[rows][cols];

        System.out.println();

        System.out.print("Enter array elements : ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println();

        System.out.println("Matrix : ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
