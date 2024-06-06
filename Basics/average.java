import java.util.Scanner;

public class average{
    public static int average(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(average(a, b, c)); //call by value
    }
}