public class factorial {

    public static int factor(int n ){
        if(n==1 || n ==0){
            return n ;
        }

         int factorial1 = factor(n-1);
        int factorial2 = n * factorial1;
        return factorial2;
    }
     public static void main(String[] args) {
        int n = 5 ;

        int sum = factor(n);
        System.out.println(sum);
        
    }
}
