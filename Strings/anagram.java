import java.util.Arrays;

public class anagram {
    // What are anagrams?
    // If two strings contain the same characters but in a different order, they can
    // be
    // said to be anagrams. Consider race and care. In this case, race's characters
    // can be formed into a study, or care's characters can be formed into race.
    // Below is a java program to check if two strings are anagrams or not.
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {// convert strings into char
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();// sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);// if the sorted char arrays are sameor identical then the strings are anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of eachother.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams ofeach other.");
            }
        } else {// case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of eachother.");
        }
    }
}
