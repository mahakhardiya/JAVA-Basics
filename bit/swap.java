public class wap {
    public static void main(String[] args) {
        int a = 3, b = 4;
        System.out.println("Before swapping: a=" +a+ " b=" +b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b; 
        System.out.println("After Swapping: a=" +a+ " b=" +b);
    }
}
