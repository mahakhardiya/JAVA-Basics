public class pyramid {
    public static void printPyramid(int n) {
        // for lines
        for (int i = n; i >= 1; i--) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
                // for stars
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPyramid(4);
    }
}
