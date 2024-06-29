public class kadane {
    public static void kadanes(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max sum is: " + maxSum);
    }

    public static int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum+ nums[i]);
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nos[] = { -2, -1, -3 };
                    //sum
                    //x
                    // sum = (-1, (-2+ -1= -3)) = -1
                    // -1 > -2---> true
                    // x = -1
        kadanes(nos);
        maxSubArray(nos);
    }
}
