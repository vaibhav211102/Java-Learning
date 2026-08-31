package Arrays_in_Java;

public class arrays {
    public static void main(String[] args) {
//        int[] arr; // Declaration of an array...

//       Declaration
//        int[] arr; or int number[];

//      Creation
//        arr = new int[5];

//      Declaration + Creation
//        int[] arr = new int[5];

//      Declaration + Initialization
//        int[] arr = {10, 20, 30, 40, 50};

        int [] a = new int[3]; // Declaration and Defining of an array...

//        a[0] = 101;
//        a[1] = 102;
//        a[3] = 103;
//
//        System.out.println(a[0]);
        int x = 101;
//        for (int i = 0; i < 3; i++) {
//            a[i] = x;
//            x++;
//        }
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(a[i]);
//        }

        for (int i = 0; i < a.length; i++) {
            a[i] = x;
            x++;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
