import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[2][2];

        arr[0][0] = 12 ;
        arr[0][1] = 78;
        arr[1][0] = 64;
        arr[1][1] = 45;

        int[][] arr1 = new int[3][3];

      
        /*------------------------------------------------------------*/

        /* Input 2D array */


        input_1: for(int row = 0; row<arr1.length;row++){
            for (int col = 0; col< arr1[row].length;col++){
                arr1[row][col]= in.nextInt();
            }
        }


        /*------------------------------------------------------------*/


        /* 01 Print 2D array */

        print_1: for(int row =0; row<arr1.length;row++){
                    System.out.print("[ ");

                            for(int col =0; col<arr1[row].length;col++) {
                                System.out.print(arr1[row][col]);
                                if (col < arr1[row].length-1) {
                                    System.out.print(", ");
                                }
                            }

                   System.out.print(" ]\n");
        }

      

      /* 02 Print 2D array */
      
        print_2: for(int row =0; row< arr1.length;row++){
            System.out.println(Arrays.toString(arr1[row]));
        }


      
      /* 03 Print 2D array */
      
        print_3: for(int[] a : arr1){
            System.out.println(Arrays.toString(a));
        }

      

    }
}
