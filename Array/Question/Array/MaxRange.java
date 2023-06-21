public class MaxRange {
    public static void main(String[] args) {

        int[] arr = { 31, 65, 98, 45, 56, 234, 673, 12,647,7363,3836,-82938239};

        /* Find Max number in a particular range in Array */
        int startRange = 0;
        int endRange = 5;
        int Max = arr[startRange];
        Max: for(int i= startRange; i<endRange;i++){
            if( Max<arr[i]){
                Max = arr[i];
            }
        }
        System.out.println("Max Num in range: "+Max);
      
    }
}
