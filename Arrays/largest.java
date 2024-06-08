public class largest {
    public static int largestNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if( largest < arr[i]){
                largest = arr[i];
            }
            if( smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest is: " +smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {20, 30, 40, 50, 10};
        System.out.println(largestNum(numbers));
    }
}
