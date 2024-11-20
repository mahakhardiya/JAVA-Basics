public class again {
    public static void rightAngled(int n) {
        // for lines
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }        
    }
    public static void rightAngledInvert(int n) {
        // for lines
        for(int i=n; i>=1 ; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }        
    }
    public static void pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }}
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        rightAngled(4);
        System.out.println("");
        rightAngledInvert(4);
        System.out.println("");
        pyramid(5);
        System.out.println("");
        diamond(5);
    }
}
