class friends {
        public static int[] twoSum(int[] nums, int target) {
            int[] p = new int[2];
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    p[0] = i;
                    p[1] = j;
                    return p;
                }
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