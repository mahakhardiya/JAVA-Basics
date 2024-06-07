public class zeroOne {
    public static int isEven(int i, int j){
        int k = i+j;
        if( (k) % 2 == 0 ){
            return k;
        }else{
            return 0;
        }
    }
    public static void printTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
               if( (i+j) == isEven(i, j)){
                System.out.print("1");
               }else{
                System.out.print("0");
               }
            }
            System.out.println("");
        }
    } 
    public static void main(String[] args) {
        printTriangle(5);
    }
}
