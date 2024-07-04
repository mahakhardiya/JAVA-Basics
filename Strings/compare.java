public class compare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony"; //both point to the same value inside a memory
        String s3 = new String("Tony"); //creates a new memory and assign the value

        if(s1 == s2){ // == compares the memory position, value pointing to a memory
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }// returns strings are equal
        if(s1 == s3){ // will return not equal
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        //therefore use .equals to compare only the VALUE inside memory
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
