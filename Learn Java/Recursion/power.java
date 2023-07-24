public class power {

    public static int calpower(int a, int b){
         if(b==0){
            return 1;
         }
        return calpower(a, b-1)*a;
    }


    public static void main(String[] args) {
        
    System.out.println(calpower(2,5));
    
}
}