public class prac {
    public static void print(int n) {
        // for lines
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        print(4);
    }
}
