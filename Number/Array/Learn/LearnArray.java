import java.util.Scanner;

public class LearnArray {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);


        /* Two ways to create array */

        int[] arr = new int[5];

        int[] arr1 = { 21, 73, 64, 42, 65 };


        /*------------------------------------------------------------*/


        /* Two ways to input array */

        input_1:  arr[0] = 76;
                  arr[1] = 14;
                  arr[2] = 34;
                  arr[3] = 89;
                  arr[4] = 56;



        input_2 :for(int j =0; j<arr.length;j++){
            //System.out.print("Enter a Array ["+j+"] : " );
            //arr[j] = in.nextInt();
        }


        /*------------------------------------------------------------*/


        /* Three ways to print array */

        print_1 :for(int i =0; i< arr.length;i++){
            //System.out.println("Array "+(i+1)+" : "+arr[i]);
        }

        print_2 :for(int num : arr){ // for every element in array, print the element
                //System.out.print(num); // here num represents element of the array
        }

        print_3 :System.out.println(Arrays.toString(arr));


        /*------------------------------------------------------------*/

        /* Rotate Array */

        rotate_1 :for(int i=arr1.length-1; i>=0;i--){
            System.out.print(arr1[i] + " ");
        }

    }
}
