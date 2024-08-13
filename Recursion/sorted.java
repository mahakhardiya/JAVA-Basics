public class sorted {

    public static boolean checkSorted(int arr[], int i){
        if(i == arr.length-1)
        {
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }
        return checkSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int prr[] = {32, 43, 12, 87, 16};
        System.out.println(checkSorted(arr, 0));
        System.out.println(checkSorted(prr, 0));
    }    
}
