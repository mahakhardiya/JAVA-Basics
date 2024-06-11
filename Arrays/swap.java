public class swap {
    public static void reverse(int arr[]){
        int first = 0; 
        int last = arr.length-1;
        int temp;

        while( first < last ){
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 8, 6, 10};
        System.out.println("Before reverse");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println("");
        System.out.println("After reverse");
        reverse(numbers);
    }
}
