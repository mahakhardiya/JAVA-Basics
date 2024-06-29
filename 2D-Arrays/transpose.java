public class transpose {
    public static void printTranspose(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;

        int transpose[][] = new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("The Transpose matrix is ");
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 2, 3, 7 }, { 5, 6, 7 } };
        System.out.println("Original matrix: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        printTranspose(matrix);
    }
}
