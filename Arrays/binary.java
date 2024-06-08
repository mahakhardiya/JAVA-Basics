public class binary {
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        while(start <=end){
            int mid = (start+end)/2;

            if( arr[mid] == key ){
                return mid;
            }
            if( arr[mid] < key ){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 8, 6, 10};
        int key = 4;
        
        int index = binarySearch(numbers, key);
        if( index == -1){
            System.out.println("KEY NOT PRESENT");
        }else{
            System.out.println("KEY FOUND AT INDEX " +index);
        }
    }
}
