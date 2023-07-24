public class sum {

    public static void sumnum(int i , int n ,int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        sumnum(i+1, n, sum);
    }

    public static void main(String[] args) {
        sumnum(1, 5, 0);
    }
}
