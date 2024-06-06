public class palindrom {
    public static void palindrome(int number){
        int n = number;
        int reverse = 0;

        while(n>0){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n = n/10; 
        }

        if( number == reverse){
            System.out.println("Number is a palindrome");
        }else {
            System.out.println("Number is not a palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome(323);
    }
}