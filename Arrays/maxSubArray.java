public class maxSubArray {
    public static void max(int arr[]){
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i+1; j<arr.length; j++){
                int end = j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    currSum += arr[k];
                }
                if( maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is: " +maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 8, 6, 10};
        max(numbers);
    }
}
