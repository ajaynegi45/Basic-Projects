
public class MinNum {
    public static void main(String[] args) {

        int[] arr = { 31, 65, 98, 45, 56, 234, 673, 12,647,7363,3836,-82938239};

        /* Find the smallest number in Array regardless of Positive or Negative */
      
        int minNum = arr[0];
        MinNum: for(int i=0; i<arr.length;i++){
            if(minNum>arr[i]) {
                minNum = arr[i];
            }
        }
      
        System.out.println("Min Num: "+minNum);




        /* Find the smallest positive number in Array */
      
        int positiveMinNum = arr[0];
        PositiveMinNum: for(int i=0; i<arr.length;i++){
            if(positiveMinNum>arr[i] && arr[i]>=0){
                positiveMinNum = arr[i];
            }
        }
      
        System.out.println("Positive Min Num: "+positiveMinNum);



    }
}
