public class largest_no {
   public static void main(String args[]) {

    int[] arr ={1,2,10,35,8,9,4};
    int ans = 0;
    for(int i=0; i<arr.length;i++){ // Largest No.
        if(ans<arr[i]){
            ans=arr[i];
        }
    } 
    System.out.println("Largest No. is "+ans);

    zero: for(int i=0; i<arr.length;i++){ // Make largest No. to zero
        if(arr[i]==ans){
            arr[i]=0;
            ans =0;
            break zero;
        }
    }

    for(int i=0; i<arr.length;i++){ //Second Largest No.
        if(ans<arr[i]){
            ans=arr[i];
        }
    }

    System.out.println("Second Largest No. is "+ans);

    }
} 