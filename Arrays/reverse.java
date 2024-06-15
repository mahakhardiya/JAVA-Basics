public class reverse {
    // public static void reverse(int arr[]){
    //     for(int i=arr.length-1; i>=0; i--){
    //         System.out.print(arr[i]+ " ");
    //     }
    // }
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
