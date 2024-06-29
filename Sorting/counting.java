import java.util.Arrays;
//used when numbers are small and in max amount and repititing, not for large numbers
//within the range if you want to sort for positive number and range is less
//quantity can be large but value should be small
public class counting {
    public static void sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 7, 6, 3};  // Example array

        System.out.println("Original array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        Arrays.sort(nums);

        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
