public class bubble {
    public static void bubbleSort(int[] arr) {
        boolean alreadySorted = true;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean noSwaps = true;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    noSwaps = false;
                    alreadySorted = false; // Since we made a swap, the array wasn't initially sorted
                }
            }
            if (noSwaps) {
                break;
            }
        }
        if (alreadySorted) {
            System.out.println("Array is already sorted!");
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 6, 5};  // Example array

        System.out.println("Original array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(nums);

        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
