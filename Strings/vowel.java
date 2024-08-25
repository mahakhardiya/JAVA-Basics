public class vowel {
    public String reverseVowels(String s) {
        char str[] = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            while(start < end && !isVowel(str[start])){
                start++;
            }

             while(start < end && !isVowel(str[end]) ){
                end--;
            }
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;

                start++;
                end--;
           }

           String ans = new String(str);
           return ans;
        }

        public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
