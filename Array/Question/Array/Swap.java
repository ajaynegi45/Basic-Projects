public class Swap {
    public static void main(String[] args) {

        int[] arr = { 31, 65, 98, 45, 56, 234, 673, 12,647,7363,3836,-82938239};

        /* Swapping two number in Array */
      
        int index1 = 0;
        int index2 = 1;
        int temp = arr[index1]; // temp will store arr[index1] value
        arr[index1] = arr[index2]; // arr[index1] will store arr[index2] value
        arr[index2] = temp; // arr[index2] will store temp value which originally arr[index1] value

    }
}
