public class string {
    public static void removeDuplicates(String str, int idx, StringBuilder newString,  boolean map[] ) //faster execution than string
    {
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newString, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newString.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        
    }
}
