public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = { 31, 65, 98, 45, 56, 234, 673, 12,647,7363,3836,-82938239};


      
        /* Print Array in Reverse Order */

        printReverse: for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }


      
        /* Reverse Array */
      
        int i = 0;
        OriginalArrayReverse: for(int j=arr.length-1; j>=arr.length/2;j--){
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
            i++;
        }


      
       /* Another Method reversing array */
        OriginalArrayReverseOptimizedVersion: for (int j = 0; j < arr.length / 2; j++) {
            if (arr[j] != arr[arr.length - 1 - j]) {
                int temp2 = arr[j];
                arr[j] = arr[arr.length - 1 - j];
                arr[arr.length - 1 - j] = temp2;
            }
        }
