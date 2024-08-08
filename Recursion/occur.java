public class occur {
    public static int checkOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return checkOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound != -1) {
            return isFound;
        }
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int prr[] = { 32, 43, 12, 87, 16, 43 };
        System.out.println(checkOccurence(arr, 12, 0));
        System.out.println(checkOccurence(prr, 43, 0));
    }
}
