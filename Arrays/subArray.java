public class subArray {
    public static void SubArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i+1; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 8, 6, 10};
        SubArray(numbers);
    }
}
