import java.util.Scanner;

public class average{
    public static int average1(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(average1(a, b, c)); //call by value
        }
    }
}