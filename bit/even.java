import java.util.*;

public class even {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
        }
        oddOrEven(n);
    }
}
