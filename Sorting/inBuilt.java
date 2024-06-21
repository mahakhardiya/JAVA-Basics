import java.util.Arrays; //O(log n)
// Arrays.sort(arr, first index, last index+1)

public class inBuilt {
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
