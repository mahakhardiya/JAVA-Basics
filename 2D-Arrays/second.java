public class second {
    public static void printSecRow(int matrix[][]) {
        int sum = 0;
        for (int j = 1; j < matrix[0].length; j++) {
            sum += matrix[1][j];
        }
        System.out.println("Total sum of second row is: " + sum);
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        printSecRow(nums);
    }
}
