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
            System.out.print("Enter a Array ["+j+"] : " );
            arr[j] = in.nextInt();
        }


        /*------------------------------------------------------------*/


        /* Three ways to print array */

        print_1 :for(int i =0; i< arr.length;i++){
            System.out.println("Array "+(i+1)+" : "+arr[i]);
        }

        print_2 :for(int num : arr){ // for every element in array, print the element
                System.out.print(num); // here num represents element of the array
        }

        print_3 :System.out.println(Arrays.toString(arr));



        /*------------------------------------------------------------*/

        

        // 1. toString(array) - converts the array to a string representation
        String arrString = Arrays.toString(arr);
        System.out.println("Array as string: " + arrString);
        

        // 2. sort(array) - sorts the elements of the array in ascending order
        Arrays.sort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        

        // 3. binarySearch(array, key) - searches for the specified key in the sorted array
        int key = 8;
        int index = Arrays.binarySearch(arr, key);
        System.out.println("Index of " + key + ": " + index);
        

        // 4. copyOf(array, length) - creates a new array with the specified length and copies elements from the original array
        int[] copiedArray = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
        

        // 5. equals(array1, array2) - checks if two arrays are equal
        int[] anotherArray = {5, 2, 8, 1, 9};
        boolean areEqual = Arrays.equals(arr, anotherArray);
        System.out.println("Are arrays equal? " + areEqual);
        

        // 6. fill(array, value) - assigns the specified value to every element of the array
        int[] filledArray = new int[5];
        int value = 7;
        Arrays.fill(filledArray, value);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
        

        // 7. hashCode(array) - returns the hash code for the array
        int hashCode = Arrays.hashCode(arr);
        System.out.println("Hash code of the array: " + hashCode);

        
        // 8. asList(array) - returns a fixed-size list backed by the specified array
        String[] names = {"John", "Alice", "Bob"};
        List<String> namesList = Arrays.asList(names);
        System.out.println("Array as list: " + namesList);
        

        // 9. sort(array, fromIndex, toIndex) - sorts a specific range of elements in the array
        int[] partialArray = {5, 2, 8, 1, 9};
        Arrays.sort(partialArray, 1, 4);
        System.out.println("Array after partial sorting: " + Arrays.toString(partialArray));


    }
}
