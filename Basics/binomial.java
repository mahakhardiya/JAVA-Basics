import java.util.Scanner;

public class binomial {

    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    public static int binomial1(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r); // nCr = n!/r! (n-r)!

        int bino = a/(b*c);

        return bino;
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter n:");
            int n = sc.nextInt();
            System.out.println("Enter r:");
            int r = sc.nextInt();

            System.out.print("Binomial coefficient is: " +binomial1(n, r));
        }
    }
}
