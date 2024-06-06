public class Primes {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void printPrimes(int n) {
        if (n == 2) {
            System.out.println(n);
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (isPrime(i) == true) {
                    System.out.print(i+ " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        printPrimes(200);
    }
}
