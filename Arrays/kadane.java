public class kadane {
    public static void kadanes(int arr[]){
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currSum = currSum + arr[i];
            if( currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max sum is: " +maxSum);
    }
    public static void main(String[] args) {
        int nos[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(nos);
    }
}
