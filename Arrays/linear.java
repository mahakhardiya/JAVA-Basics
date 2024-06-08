public class linear {
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<=numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1; // key does not exist
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 1, 8, 6, 10, 9};
        int key = 10;
        
        int index = linearSearch(numbers, key);
        if( index == -1){
            System.out.println("KEY NOT PRESENT");
        }else{
            System.out.println("KEY FOUND AT INDEX " +index);
        }
    }
}
