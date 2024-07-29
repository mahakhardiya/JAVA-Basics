public class demo {
    public static void printDecre(int n){
        if(n == 1){
            System.out.println(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDecre(n-1);
    }
    public static void printIncre(int n){
        if(n == 1){
            System.out.println(n+" ");
            return;
        }
        printIncre(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        printDecre(n);
    }
}
