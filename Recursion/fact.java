public class fact {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int factn = n*factorial(n-1);
        return factn;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
