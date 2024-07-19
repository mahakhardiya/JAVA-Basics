public class set {
    public static int setBits(int n){
        //complexity log(n)+1
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){ //check LSB
                count++;
            }
                n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(setBits(15));
    }
}
