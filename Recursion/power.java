class Solution {
    public double myPow(double a, int n) {
        if (n == 0) {
            return 1;
        }

        if (n > 0) {
            double halfPower = myPow(a, n / 2);
            double halfPowerSq = halfPower * halfPower;

            if (n % 2 == 0) {
                return halfPowerSq;
            } else {
                return a * halfPowerSq;
            }

        } else {
            // Handle edge case for n = Integer.MIN_VALUE
            if (n == Integer.MIN_VALUE) {
                a = 1 / a;
                // Use Integer.MAX_VALUE and adjust by multiplying once more
                return myPow(a, Integer.MAX_VALUE) * a;
            }

            a = 1 / a;
            n = -n;

            double halfPower = myPow(a, n / 2);
            double halfPowerSq = halfPower * halfPower;

            if (n % 2 == 0) {
                return halfPowerSq;
            } else {
                return a * halfPowerSq;
            }
        }
    }
}
