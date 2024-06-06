public class binary {
    public static void decTobin(int decNum){
        int pow = 0;
        int binNum = 0;
        int myNum = decNum;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        System.out.println("The conversion of decimal " +myNum+ " to binary is " +binNum);
    } 
    public static void main(String[] args) {
        decTobin(5);
    }
}
