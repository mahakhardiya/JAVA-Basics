public class swap {

    public static void swap1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 10, b = 5;
        swap1(a, b); //call by value (copy of the var a and b is passed to the function, original val is never passed)
        System.out.println(a);
        System.out.println(b);
        // java always work in call by value
    }
}
