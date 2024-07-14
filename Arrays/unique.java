import java.util.Arrays;

public class unique {
    public static boolean dupli(int count[]) {

        Arrays.sort(count);

        int[] freq = new int[count.length];
        int uniqueCount = 0;

        for (int i = 0; i <count.length-1; i++) {
            if (count[i] == count[i + 1]) {
                uniqueCount++;
            } else {
                freq[i] = uniqueCount + 1;
                uniqueCount = 0;
            }
        }

        freq[count.length-1] = uniqueCount + 1;

        for(int i=0; i<freq.length-1; i++){
            for(int j=i+1; j<freq.length; j++){
                if(freq[i] == freq[j] && freq[i] != 0){
                    return false;
                }             
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = { -3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(dupli(nums));
    }
}
