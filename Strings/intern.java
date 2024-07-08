public class intern {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Without interning
        System.out.println(str1 == str2); // Output: false

        // With interning
        String str3 = str1.intern();
        String str4 = str2.intern();
        System.out.println(str3 == str4); // Output: true
    }
}
