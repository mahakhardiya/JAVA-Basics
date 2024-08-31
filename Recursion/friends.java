class friends {
    public static int[] twoSum(int[] nums, int target) {
        int[] p = new int[2];
        int i = 0;
        int j = nums.length - 1;
        
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                p[0] = i;
                p[1] = j;
                return p;
            } else if (sum < target) {
                i++;  // Increase the lower index to get a larger sum
            } else {
                j--;  // Decrease the upper index to get a smaller sum
            }
        }
        
        return null;
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target=9;
        System.out.println(twoSum(nums, target));
    }
}