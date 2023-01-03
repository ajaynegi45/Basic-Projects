/* Print Fibonacci Series  */
   

        /* Recursion Method */
public class fibonacci {

    public static void printfib(int a, int b, int n){
        if(n==0){
            return;
        } 

        int c = a+b;
        System.out.println(c);
        printfib(b,c,n-1);
    }
    public static void main(String[] args) {
        
        int a = 0;
        int b =1;
        int n = 7;
        System.out.println(a);
        System.out.println(b);
        printfib(0,1,n-2);




        /*  Itration method */
 

         int a = 0;
         int b = 1;
         int n = 7;
         System.out.println(a);
         System.out.println(b);

         for (int i=1;i<=n-2; i++){
             int c = a + b ;
             System.out.println(c);
            a = b;
            b = c;
         }

        
     }
}
