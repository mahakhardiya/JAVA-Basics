public class substring {
    public static String printSubstring( String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr; //made by our own substring function
    } 
    public static void main(String[] args) {
        //for substring required---> si (statring index) ei (ending index EXCLUDED)
        String str = "HelloWorld"; //built-in substring function
        System.out.println(str.substring(0,5)); // to print Hello
    }
}

