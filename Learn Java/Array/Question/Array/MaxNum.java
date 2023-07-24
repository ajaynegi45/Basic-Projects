public class MaxNum {
    public static void main(String[] args) {

        int[] arr = { 31, 65, 98, 45, 56, 234, 673, 12,647,7363,3836,-82938239};


        /* Find the Maximum number in Array */
      
        int maxNum = arr[0]; 
      
        MaxNum: for(int i=0; i<arr.length;i++){
            if(maxNum<arr[i]){
                maxNum = arr[i];
            }
        }
      
        System.out.println("Max Num: "+maxNum); // Print Max Number 

    }
}
