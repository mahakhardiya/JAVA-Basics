import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;

        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
