import java.util.Scanner;

public class product {

    public static int multiply(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int product = multiply(a, b);
            System.out.println(product);
        }
    }
}
