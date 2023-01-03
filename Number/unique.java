public class unique {
    public static void main(String[] args) { // finds the unique number in an array of integers.

        /*
        The code starts by declaring an int[] Array variable called arr and will hold the numbers that are being searched for.
        */
        int [] arr={0,9,8,7,6,1,2,2,3,4,5,6,7,8,9,3,4,1,5,0};


        /*
         * The variable i, is used to keep track of how many elements are in the arr array.
         * The variable j, is used to keep track of what's next in the arr (array) of i.
         * The for loop iterates through the array until it reaches the end and compare each element to the another element.
         * If the two elements are equal, then the element at index i  and j are set to be -1.
         * The loop then iterates over indexes, until all elements have been compared.
         */
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++) {
            if (arr[i]==arr[j]){
                arr[i]= -1;
                arr[j]= -1;
            }
          } 
        }


        /* 
         * The for loop iterates through each element in the list until it finds one with a value greater than 0 which will be set as ans (the unique no.).

         * The for loop iterates through each element of the arr(array) and checks if any element is greater than 0, it is considered to be a unique number and it will print.
        */

        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                System.out.println("Unique No."+arr[i]);
                j++;

            }
        }

        if(j==0){
            System.out.println("There is no Unique number present in this array");

        }
    }
}